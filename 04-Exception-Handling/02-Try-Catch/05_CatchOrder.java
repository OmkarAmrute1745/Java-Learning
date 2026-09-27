/**
 * Topic: CatchOrder
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_CatchOrder {

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Invalid value");
        } catch (IllegalArgumentException exception) {
            System.out.println("Specific exception first.");
        } catch (RuntimeException exception) {
            System.out.println("General RuntimeException.");
        }
    }
}
