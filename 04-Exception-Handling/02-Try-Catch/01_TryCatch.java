/**
 * Topic: TryCatch
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_TryCatch {

    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("ABC");
            System.out.println(value);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number.");
        }
    }
}
