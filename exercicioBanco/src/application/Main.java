package application;


import entities.BankAccount;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/u)? ");
        char option = sc.next().charAt(0);


        if (option == 'y' || option == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            bankAccount = new BankAccount(number, holder, depositValue);


        } else {
            bankAccount = new BankAccount(number, holder);

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}
