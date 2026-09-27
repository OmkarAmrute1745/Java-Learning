/**
 * Topic: MethodPropagation
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void firstMethod() { secondMethod(); }
    static void secondMethod() { int value = 10 / 0; System.out.println(value); }

class Concept01_MethodPropagation {

    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (ArithmeticException exception) {
            System.out.println("Handled by main.");
        }
    }
}
