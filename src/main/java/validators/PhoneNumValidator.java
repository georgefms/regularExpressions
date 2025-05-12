package validators;
import interfaces.Validator;
import java.util.regex.Pattern;

/**
 *
 * @author georgef
 */
public class PhoneNumValidator implements Validator{
    // Aceita: (xx) 9xxxx-xxxx, (xx) 9xxxxxxxx, xx 9xxxxxxxx
    private static final Pattern validationMask = Pattern.compile("^(\\(\\d{2}\\)\\s?|\\d{2}\\s)9\\d{4}-?\\d{4}$");
    
    @Override
    public boolean validate(String phonenum) {
        boolean isValid = validationMask.matcher(phonenum).matches();
        if (!isValid) {
            showError(phonenum);
        }
        return isValid;
    }

    private void showError(String phonenum) {
        if (phonenum == null || phonenum.isEmpty()) {
            System.out.println("❌ O telefone está vazio.");
            return;
        }

        if (!phonenum.matches(".*9\\d{4}.*")) {
            System.out.println("❌ O número deve começar com 9 após o DDD.");
        }

        if (!phonenum.matches(".*\\d{4}[-]?\\d{4}$")) {
            System.out.println("❌ O número deve terminar com 8 dígitos, podendo ter hífen opcional.");
        }

        if (!phonenum.matches("^(\\(\\d{2}\\)\\s?|\\d{2}\\s).*")) {
            System.out.println("❌ O DDD deve estar entre parênteses ou separado por espaço (ex: (91) ou 91 ).");
        }

        if (phonenum.replaceAll("\\D", "").length() != 11) {
            System.out.println("❌ O número deve conter exatamente 11 dígitos.");
        }
    }
}
