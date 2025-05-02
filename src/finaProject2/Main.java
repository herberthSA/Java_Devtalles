package finaProject2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Herberth Mancía",500.0);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();

    }
}
