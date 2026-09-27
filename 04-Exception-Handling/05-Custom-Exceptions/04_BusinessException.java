/**
 * Topic: BusinessException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String message) { super(message); }
}

class Account {
    private double balance = 1000;
    void withdraw(double amount) {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        balance -= amount;
    }
}

class Concept04_BusinessException {

    public static void main(String[] args) {
        try {
            new Account().withdraw(1500);
        } catch (InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
