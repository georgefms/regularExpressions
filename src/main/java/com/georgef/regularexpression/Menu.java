package com.georgef.regularexpression;
import java.util.ArrayList ;
import java.util.List ;
import java.util.Map;
import java.util.Scanner ;
import models.User;
import validators.*;
import interfaces.Validator;
/**
 *
 * @author georgef
 */

public class Menu {

        private List<User> users = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        private final Map<String, Validator> validadores = Map.of(
        "Nome", new NameValidator(),
        "Email", new EmailValidator(),
        "Senha", new PwValidator(),
        "CPF", new CpfValidator(),
        "Telefone", new PhoneNumValidator()
    );

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
                case 1 -> cadastrarUsuario();
                case 2 -> listarUsuarios();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

            } while (opcao != 0);
        }

        private void cadastrarUsuario() {
            System.out.println("\n--- Cadastro de Usuário ---");

            String nome = lerCampo("Nome");
            String email = lerCampo("Email");
            String senha = lerCampo("Senha");
            String cpf = lerCampo("CPF");
            String telefone = lerCampo("Telefone");

            users.add(new User(nome, email, senha, cpf, telefone));
        System.out.println("✅ Usuário cadastrado com sucesso!");
        }

        private String lerCampo(String campo) {
            String entrada;
            Validator validador = validadores.get(campo);
            if (validador == null) throw new IllegalArgumentException("Validador não encontrado: " + campo);

            do {
                System.out.print(campo + ": ");
                entrada = scanner.nextLine();
            } while (!validador.validate(entrada));

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
