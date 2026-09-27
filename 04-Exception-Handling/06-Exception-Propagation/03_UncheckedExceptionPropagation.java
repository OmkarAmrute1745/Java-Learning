/**
 * Topic: UncheckedExceptionPropagation
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void firstMethod() { secondMethod(); }
    static void secondMethod() { throw new ArithmeticException("Calculation failed"); }

class Concept03_UncheckedExceptionPropagation {

    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (ArithmeticException exception) {
            System.out.println("Unchecked exception reached caller.");
        }
    }
}
