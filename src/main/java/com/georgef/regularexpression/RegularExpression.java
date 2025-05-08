package com.georgef.regularexpression;
import java.util.Scanner;
import validators.NameValidator;

/**
 *
 * @author georgef
 */
public class RegularExpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NameValidator validator = new NameValidator();
        
        System.out.print("Insira um nome: ");
        String name = scan.nextLine();
        if (validator.validate(name)){
            System.out.println("Nome aceito");
        } else {
            System.out.println("Nome invalido");
        }
    }
}
