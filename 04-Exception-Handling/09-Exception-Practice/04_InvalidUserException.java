/**
 * Topic: InvalidUserException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InvalidUserException extends RuntimeException {
    InvalidUserException(String message) { super(message); }
}

class Concept04_InvalidUserException {

    public static void main(String[] args) {
        try {
            throw new InvalidUserException("Invalid user details");
        } catch (InvalidUserException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
