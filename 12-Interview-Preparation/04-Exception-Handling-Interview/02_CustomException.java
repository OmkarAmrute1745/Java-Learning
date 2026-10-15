/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Exception handling
 * CONCEPT: Custom exceptions
 *
 * What is it?
 * A custom exception represents a meaningful failure in a particular domain.
 *
 * Why do we need it?
 * It gives callers a clear way to distinguish expected business failures.
 *
 * Key points:
 * - Use descriptive names and preserve the original cause when wrapping an exception.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Do not swallow exceptions or catch Exception without a reason.
 */

class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String message) { super(message); }
}
class Concept02_CustomException {
    static void withdraw(double balance, double amount) {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        System.out.println("Remaining: " + (balance - amount));
    }
    public static void main(String[] args) {
        try { withdraw(100, 150); }
        catch (InsufficientBalanceException ex) { System.out.println(ex.getMessage()); }
    }
}
