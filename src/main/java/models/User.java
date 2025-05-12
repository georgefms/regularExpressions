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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public User(String name, String email, String pw, String cpf, String phoneNum) {
        this.name = name;
        this.email = email;
        this.pw = pw;
        this.cpf = cpf;
        this.phoneNum = phoneNum;
    }
    
    public void update(String name, String email, String pw, String cpf, String phoneNum) {
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

