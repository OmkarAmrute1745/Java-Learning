/**
 * Topic: MultiCatch
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_MultiCatch {

    public static void main(String[] args) {
        try {
            int value = Integer.parseInt(args.length > 0 ? args[0] : "ABC");
            System.out.println(100 / value);
        } catch (NumberFormatException | ArithmeticException exception) {
            System.out.println("Handled: " + exception.getClass().getSimpleName());
        }
    }
}
