package com.georgef.regularexpression;
//import java.util.Scanner;
import java.util.List;
import validators.EmailValidator;
import validators.NameValidator;
import validators.PwValidator;

/**
 *
 * @author georgef
 */
public class RegularExpression {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        NameValidator validator = new NameValidator();
//        
//        System.out.print("Insira um nome: ");
//        String name = scan.nextLine();
//        if (validator.validate(name)){
//            System.out.println("Nome aceito");
//        } else {
//            System.out.println("Nome invalido");
//        }
        NameValidator nomeValidator = new NameValidator();
        EmailValidator emailValidator = new EmailValidator();

        System.out.println("==== Testes de Nome ====");
        List<String> nomes = List.of(
            "Alan Turing",
            "Noam Chomsky",
            "1Alan",
            "Alan",
            "A1an",
            "alan turing",  // tudo minúsculo
            "Ada"           // apenas um nome
        );
        for (String nome : nomes) {
            System.out.println("\nTestando: \"" + nome + "\"");
            boolean valido = nomeValidator.validate(nome);
            System.out.println(valido ? "✅ Aceito" : "❌ Rejeitado");
        }

        System.out.println("\n==== Testes de E-mail ====");
        List<String> emails = List.of(
            "a@a.br",
            "divulga@ufpa.br",
            "@",
            "a@.br",
            "T@teste.br",
            "user@site.com",
            "emailsemarroba.br"
        );
        for (String email : emails) {
            System.out.println("\nTestando: \"" + email + "\"");
            boolean valido = emailValidator.validate(email);
            System.out.println(valido ? "✅ Aceito" : "❌ Rejeitado");
        }
        
        System.out.println("\n==== Testes de Senha ====");
        PwValidator senhaValidator = new PwValidator();

        List<String> senhas = List.of(
            "F123456A",     // válido
            "abcdefgH",     // sem número
            "1234567T",     // válido
            "ropsSoq0",     // válido
            "F1234567A",    // 9 caracteres
            "12345678",     // sem maiúscula
            "abcdefgh"      // sem número nem maiúscula
        );

        for (String senha : senhas) {
            System.out.println("\nTestando: \"" + senha + "\"");
            boolean valido = senhaValidator.validate(senha);
            System.out.println(valido ? "✅Aceita" : "❌Rejeitada");
        }

        // Repita essa lógica para senha, CPF e telefone depois que criarmos os respectivos validadores.
   }
}
