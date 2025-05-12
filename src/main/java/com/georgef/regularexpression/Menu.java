package com.georgef.regularexpression;
import java.util.ArrayList ;
import java.util.List ;
import java.util.Scanner ;
import models.User;
import validators.*;
/**
 *
 * @author georgef
 */

public class Menu {

        private List<User> users = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        private NameValidator nomeValidator = new NameValidator();
        private EmailValidator emailValidator = new EmailValidator();
        private PwValidator senhaValidator = new PwValidator();
        private CpfValidator cpfValidator = new CpfValidator();
        private PhoneNumValidator telefoneValidator = new PhoneNumValidator();

        public void exibir() {
            int opcao;
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Cadastrar novo usuário");
                System.out.println("2. Listar usuários");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // consumir quebra de linha

                switch (opcao) {
                    case 1:
                        cadastrarUsuario();
                        break;
                    case 2:
                        listarUsuarios();
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);
        }

        private void cadastrarUsuario() {
            System.out.println("\n--- Cadastro de Usuário ---");

            String nome = lerCampo("Nome", nomeValidator);
            String email = lerCampo("Email", emailValidator);
            String senha = lerCampo("Senha", senhaValidator);
            String cpf = lerCampo("CPF", cpfValidator);
            String telefone = lerCampo("Telefone", telefoneValidator);

            users.add(new User(nome, email, senha, cpf, telefone));
            System.out.println("✅ Usuário cadastrado com sucesso!");
        }

        private String lerCampo(String label, Object validator) {
            String entrada;
            boolean valido;
            do {
                System.out.print(label + ": ");
                entrada = scanner.nextLine();

                if (validator instanceof NameValidator) {
                    valido = ((NameValidator) validator).validate(entrada);
                } else if (validator instanceof EmailValidator) {
                    valido = ((EmailValidator) validator).validate(entrada);
                } else if (validator instanceof PwValidator) {
                    valido = ((PwValidator) validator).validate(entrada);
                } else if (validator instanceof CpfValidator) {
                    valido = ((CpfValidator) validator).validate(entrada);
                } else if (validator instanceof PhoneNumValidator) {
                    valido = ((PhoneNumValidator) validator).validate(entrada);
                } else {
                    valido = false;
                }

            } while (!valido);
            return entrada;
        }

        private void listarUsuarios() {
            if (users.isEmpty()) {
                System.out.println("Nenhum usuário cadastrado.");
                return;
            }

            System.out.println("\n--- Lista de Usuários ---");
            for (User u : users) {
                System.out.println(u);
                System.out.println("-------------------------");
            }
        }
}
