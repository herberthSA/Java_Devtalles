package finaProject2;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Se realizó un deposito de: "+ amount);
        }else {
            System.out.println("No se pudo realizar la operación");

        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-=amount;
            System.out.println("Retiro exitoso!!");
        }else {
            System.out.println("Monto incorrecto ó Fondos insuficientes");
        }
    }

    public void getBalance() {
        System.out.println("Monto total: " + balance );
    }
}
