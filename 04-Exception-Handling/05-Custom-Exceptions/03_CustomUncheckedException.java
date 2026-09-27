/**
 * Topic: CustomUncheckedException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InvalidUserException extends RuntimeException {
    InvalidUserException(String message) { super(message); }
}

class Validator {
    static void validateUser(String name) {
        if (name == null || name.isBlank()) throw new InvalidUserException("User name is required");
    }
}

class Concept03_CustomUncheckedException {

    public static void main(String[] args) {
        validateUser("");
    }
}
