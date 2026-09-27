/**
 * Topic: AgeValidationException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class AgeValidator {
    static void validate(int age) {
        if (age < 18) throw new IllegalArgumentException("Age must be 18 or above");
    }
}

class Concept02_AgeValidationException {

    public static void main(String[] args) {
        try {
            AgeValidator.validate(16);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
