import java.util.Scanner;

public class Login {
    private String utilizador;
    private String pass;

    public Login(String utilizador, String pass) {
        this.utilizador = utilizador;
        this.pass = pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean fazerLogin(String utilizador, String pass) {
        try {
            if (!this.utilizador.equals(utilizador)) {
                throw new Exception("Utilizador incorreto");
            }
            if (!this.pass.equals(pass)) {
                throw new Exception("Senha incorreta");
            }
            System.out.println("Login bem-sucedido!");
            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}