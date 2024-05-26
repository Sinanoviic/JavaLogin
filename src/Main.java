public class Main {
    public static void main(String[] args) {


        IDPassword idPassword = new IDPassword();

        LoginPage loginPage = new LoginPage(idPassword.getLoginInfo());
    }
}
