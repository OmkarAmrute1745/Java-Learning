/**
 * Topic: BankAccountException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Account {
    private double balance = 1000;
    void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }
}

class Concept01_BankAccountException {

    public static void main(String[] args) {
        try {
            new Account().withdraw(1500);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
