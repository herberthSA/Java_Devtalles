package finaProject2;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner scanner;

    public BankApp( BankAccount bankAccount) {
        this.scanner = new Scanner(System.in);
        this.bankAccount = bankAccount;
    }

    public void start(){
        int option;
        do {
            displayMenu();
            option = selectOption();
            processOption(option);

        }while(option != 4);
    }


    public void handleDeposit(){
        System.out.println("Ingrese monto a depositar");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);

    }
    public void handleWithdraw(){
        System.out.println("Ingrese monto a retirar");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }

    public int selectOption (){
        return  scanner.nextInt();
    }
    private void displayMenu(){
        System.out.println("\nSeleccionar opciones");
        System.out.println("1 - Dépositar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Mostrar saldo");
        System.out.println("4 - Salir");
    }

    private void processOption(int option){
        switch (option){
            case 1:{
                handleDeposit();
                break;
            }
            case 2:{
                handleWithdraw();
                break;
            }
            case 3:{
                bankAccount.getBalance();
                break;
            }
            case 4:{
                System.out.println("Gracias por utilizar el servicio");
                scanner.close();
                break;

            }
            default:
                System.out.println("Ingreso un valor erroneo");
                break;


        }


    }

}
