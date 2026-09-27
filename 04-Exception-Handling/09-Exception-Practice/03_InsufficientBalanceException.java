/**
 * Topic: InsufficientBalanceException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { super(message); }
}

class Concept03_InsufficientBalanceException {

    public static void main(String[] args) {
        try {
            throw new InsufficientBalanceException("Balance is not sufficient");
        } catch (InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
