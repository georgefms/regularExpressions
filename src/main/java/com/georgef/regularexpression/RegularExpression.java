package com.georgef.regularexpression;
//import java.util.Scanner;
//import java.util.List;
//import validators.CpfValidator;
//import validators.EmailValidator;
//import validators.NameValidator;
//import validators.PhoneNumValidator;
//import validators.PwValidator;
import test.*;

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
//        NameValidator nomeValidator = new NameValidator();
//        EmailValidator emailValidator = new EmailValidator();
//
//        System.out.println("==== Testes de Nome ====");
//        List<String> nomes = List.of(
//            "Alan Turing",
//            "Noam Chomsky",
//            "1Alan",
//            "Alan",
//            "A1an",
//            "alan turing",  // tudo minúsculo
//            "Ada"           // apenas um nome
//        );
//        for (String nome : nomes) {
//            System.out.println("\nTestando: \"" + nome + "\"");
//            boolean valido = nomeValidator.validate(nome);
//            System.out.println(valido ? "✅ Aceito" : "❌ Rejeitado");
//        }
//
//        System.out.println("\n==== Testes de E-mail ====");
//        List<String> emails = List.of(
//            "a@a.br",
//            "divulga@ufpa.br",
//            "@",
//            "a@.br",
//            "T@teste.br",
//            "user@site.com",
//            "emailsemarroba.br"
//        );
//        for (String email : emails) {
//            System.out.println("\nTestando: \"" + email + "\"");
//            boolean valido = emailValidator.validate(email);
//            System.out.println(valido ? "✅ Aceito" : "❌ Rejeitado");
//        }
//        
//        System.out.println("\n==== Testes de Senha ====");
//        PwValidator senhaValidator = new PwValidator();
//
//        List<String> senhas = List.of(
//            "F123456A",     // válido
//            "abcdefgH",     // sem número
//            "1234567T",     // válido
//            "ropsSoq0",     // válido
//            "F1234567A",    // 9 caracteres
//            "12345678",     // sem maiúscula
//            "abcdefgh"      // sem número nem maiúscula
//        );
//
//        for (String senha : senhas) {
//            System.out.println("\nTestando: \"" + senha + "\"");
//            boolean valido = senhaValidator.validate(senha);
//            System.out.println(valido ? "✅Aceita" : "❌Rejeitada");
//        }
//        
//        System.out.println("\n==== Testes de CPF ====");
//        CpfValidator cpfValidator = new CpfValidator();
//
//        List<String> cpfs = List.of(
//            "123.456.789-09",  // válido
//            "000.000.000-00",  // válido
//            "123.456.789-0",   // inválido
//            "111.111.11-11",   // inválido
//            "12345678909",     // sem formatação
//            "abc.def.ghi-jk"   // letras
//        );
//
//        for (String cpf : cpfs) {
//            System.out.println("\nTestando: \"" + cpf + "\"");
//            boolean valido = cpfValidator.validate(cpf);
//            System.out.println(valido ? "✅ Aceito" : "❌ Rejeitado");
//        }
//        
//        System.out.println("\n==== Testes de Telefone ====");
//        PhoneNumValidator telefoneValidator = new PhoneNumValidator();
//
//        List<String> telefones = List.of(
//            "(91) 99999-9999", // válido
//            "(91) 999999999",  // válido
//            "91 999999999",    // válido
//            "(91) 59999-9999", // inválido (não começa com 9)
//            "99 99999-9999",   // inválido
//            "(94)95555-5555",  // inválido (sem espaço após DDD)
//            "9112345678"       // inválido (formato incorreto)
//        );
//
//        for (String tel : telefones) {
//            System.out.println("\nTestando: \"" + tel + "\"");
//            boolean isValid = telefoneValidator.validate(tel);
//            System.out.println(isValid ? "✅ Aceito" : "❌ Rejeitado");
//        }
        Test.runTest();
   }
}
