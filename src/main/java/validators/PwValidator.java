package validators;
import java.util.regex.Pattern;

/**
 *
 * @author georgef
 */
public class PwValidator {
    // Regex para verificar se há exatamente 8 caracteres válidos (letras e números)
    private static final Pattern validationMask = Pattern.compile("^[a-zA-Z0-9]{8}$");

    public boolean validar(String password) {
        boolean validFormat = validationMask.matcher(password).matches();
        boolean haveUpper = password.matches(".*[A-Z].*");
        boolean haveNum = password.matches(".*[0-9].*");

        if (!validFormat || !haveUpper || !haveNum) {
            showError(password, validFormat, haveUpper, haveNum);
            return false;
        }

        return true;
    }

    private void showError(String password, boolean validFormat, boolean haveUpper, boolean haveNum) {
        if (password == null || password.isEmpty()) {
            System.out.println("❌ A senha está vazia.");
            return;
        }

        if (password.length() != 8) {
            System.out.println("❌ A senha deve conter exatamente 8 caracteres.");
        }

        if (!validFormat) {
            System.out.println("❌ A senha deve conter apenas letras (A–Z, a–z) e números (0–9).");
        }

        if (!haveUpper) {
            System.out.println("❌ A senha deve conter pelo menos uma letra maiúscula.");
        }

        if (!haveNum) {
            System.out.println("❌ A senha deve conter pelo menos um número.");
        }
    }
}
