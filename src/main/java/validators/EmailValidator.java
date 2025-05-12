package validators;

import interfaces.Validator;
import java.util.regex.Pattern;

/**
 *
 * @author georgef
 */
public class EmailValidator implements Validator{
        private static final Pattern validationMask = Pattern.compile("^[a-z]+@[a-z]+\\.br$");

        @Override
        public boolean validate(String email){
        boolean isValid = validationMask.matcher(email).matches();
        if (!isValid) {
            showError(email);
        }
        return isValid;
    }
    
    private void showError(String email) {
        //Verifica Se o email esta vazio
        if (email == null || email.isEmpty()) {
            System.out.println("❌ O e-mail está vazio.");
            return;
        }
        //Verifica se o email nao comeca com @
        if (email.startsWith("@")) {
            System.out.println("❌ O e-mail não pode começar com '@'.");
        }
        //Verifica se sem somente um @
        if (!email.contains("@")) {
            System.out.println("❌ O e-mail deve conter exatamente um '@'.");
        } else {
            String[] parts = email.split("@", -1);
            if (parts.length != 2) {
                System.out.println("❌ O e-mail deve conter exatamente um '@'.");
            } else {
                String usuario = parts[0];
                String domain = parts[1];

                if (!usuario.matches("[a-z]+")) {
                    System.out.println("❌ A parte antes do '@' deve conter apenas letras minúsculas.");
                }

                if (!domain.endsWith(".br")) {
                    System.out.println("❌ O domínio deve terminar com '.br'.");
                } else {
                    String domainWttBr = domain.substring(0, domain.length() - 3); // remove ".br"
                    if (!domainWttBr.matches("[a-z]+")) {
                        System.out.println("❌ A parte entre '@' e '.br' deve conter apenas letras minúsculas.");
                    }
                }
            }
        }    

    }
}