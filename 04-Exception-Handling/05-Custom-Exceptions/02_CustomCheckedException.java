/**
 * Topic: CustomCheckedException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) { super(message); }
}

class Validator {
    static void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Amount must be positive");
    }
}

class Concept02_CustomCheckedException {

    public static void main(String[] args) {
        try {
            validateAmount(-10);
        } catch (InvalidAmountException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
