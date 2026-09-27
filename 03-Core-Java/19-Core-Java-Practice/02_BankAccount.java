/**
 * Topic: BankAccount
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Account {
    private double balance;
    Account(double balance) { this.balance = balance; }
    void deposit(double amount) { if (amount > 0) balance += amount; }
    void withdraw(double amount) { if (amount > 0 && amount <= balance) balance -= amount; }
    double getBalance() { return balance; }
}

class Concept02_BankAccount {

    public static void main(String[] args) {
        Account account = new Account(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}
