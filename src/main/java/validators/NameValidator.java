package validators;
import interfaces.Validator;
import java.util.regex.Pattern;
/**
 *
 * @author georgef
 */
public class NameValidator implements Validator{
    //Mascara de validacao a ser aceita nos nomes.
    //Uma letra maiscula em cada parte
    //uma ou mais letras minusculas a seguir
    //um espaço literal
    //$ -> fim da string
    private static final Pattern validationMask = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
    
    @Override
    public boolean validate(String nome){
        boolean isValid = validationMask.matcher(nome).matches();
        if (!isValid) {
            showError(nome);
        }
        return isValid;
    }
    
    private void showError(String nome){
        //Divide o nome em um array de duas partes
        //Ex: george felipe -> ["george", "felipe"]
        String[] parts = nome.trim().split(" ");
        
        //Testa se o nome segue a estrutura: 
        //Nome + Sobrenome
        if (parts.length != 2) {
            System.out.println("O nome recebe apenas: nome e sobrenome");
        }
        
        
        for(int i = 0; i < parts.length; i++){
            String part = parts[i];
            if (part.isEmpty()){
                System.out.println("A parte "+ (i + 1) +" nao pode estar vazia");
                continue;
            }
            
            char first = part.charAt(0);
            if (!Character.isUpperCase(first)){
                System.out.println("A parte "+ (i+1)+ " deve começar com letra maiuscula");
            }
            
            for (int j = 1; j < part.length(); j++){
                char c = part.charAt(j);
                if (!Character.isLowerCase(c)){
                    System.out.printf("Caractere inválido na parte %d: '%c' (deve ser minúsculo)%n", i + 1, c);
                }
            }

        }
        
        
    }
}
