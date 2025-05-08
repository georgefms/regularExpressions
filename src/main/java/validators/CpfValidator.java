package validators;
import java.util.regex.Pattern;

/**
 *
 * @author georgef
 */

public class CpfValidator {
    private static final Pattern validationMask = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");

    public boolean validate(String cpf) {
        boolean valid = validationMask.matcher(cpf).matches();
        if (!valid) {
            showError(cpf);
        }
        return valid;
    }

    private void showError(String cpf) {
        //o Cpf nao pode estar vazioã
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("❌ O CPF está vazio.");
            return;
        }
        //Verifica se existem apenas numeros e hifen
        if (!cpf.matches("^[0-9.\\-]+$")) {
            System.out.println("❌ O CPF deve conter apenas números, pontos e hífen.");
        }
        //Verifica se o tamnho e diferente de 14 
        if (cpf.length() != 14) {
            System.out.println("❌ O CPF deve conter exatamente 14 caracteres no formato xxx.xxx.xxx-xx.");
        }

        // Contar os dígitos
        String onlyDigits = cpf.replaceAll("[^0-9]", "");
        if (onlyDigits.length() != 11) {
            System.out.println("❌ O CPF deve conter exatamente 11 dígitos numéricos.");
        }
        //valida o formato do cpf
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            System.out.println("❌ O formato deve ser xxx.xxx.xxx-xx (com pontos e hífen nos lugares certos).");
        }
    }
}
