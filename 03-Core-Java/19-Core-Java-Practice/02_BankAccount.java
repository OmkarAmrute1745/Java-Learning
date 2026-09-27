/**
 * Topic: 02 BankAccount
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class 02BankAccount {

    public static void main(String[] args) {
        Account account = new Account(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}
