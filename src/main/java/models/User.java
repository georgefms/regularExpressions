package models;

/**
 *
 * @author georgef
 */
public class User {

    private String name;
    private String email;
    private String pw;
    private String cpf;
    private String phoneNum;

    public User(String name, String email, String pw, String cpf, String phoneNum) {
        this.name = name;
        this.email = email;
        this.pw = pw;
        this.cpf = cpf;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nEmail: %s\nCPF: %s\nTelefone: %s",
                name, email, cpf, phoneNum);
    }
}

