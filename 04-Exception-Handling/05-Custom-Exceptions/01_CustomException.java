/**
 * Topic: CustomException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Validation {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be 18 or above");
    }
}

class Concept01_CustomException {

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
