public class Main {
    public static void main(String[] args) {
        Login login = new Login("admin", "123");
        boolean sucesso = login.fazerLogin("admin", "123"); // retorna true
        //boolean falha = login.fazerLogin("admin", "senha_errada"); // imprime erro e retorna false
    }
}