/**
 * Topic: NestedTry
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_NestedTry {

    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException exception) {
                System.out.println("Inner catch handled the exception.");
            }
        } catch (Exception exception) {
            System.out.println("Outer catch.");
        }
    }
}
