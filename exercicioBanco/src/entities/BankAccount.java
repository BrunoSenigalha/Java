package entities;

public class BankAccount {

    private final int NUMBER;
    private String holder;
    private double balance;


    public BankAccount(int number, String holder, double balance) {
        this.NUMBER = number;
        this.holder = holder;
        deposit(balance);
    }

    public BankAccount(int number, String holder) {
        this.NUMBER = number;
        this.holder = holder;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account "
                + NUMBER
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;

    }

}
