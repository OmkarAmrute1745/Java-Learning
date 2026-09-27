/**
 * Topic: ThrowKeyword
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

class Concept01_ThrowKeyword {

    public static void main(String[] args) {
        validateAge(15);
    }
}
