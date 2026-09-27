/**
 * Topic: ThrowVsThrows
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void validate() throws IllegalArgumentException {
        throw new IllegalArgumentException("Validation failed");
    }

class Concept03_ThrowVsThrows {

    public static void main(String[] args) {
        try {
            validate();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
