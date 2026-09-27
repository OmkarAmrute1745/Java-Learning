/**
 * Topic: MultipleCatch
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_MultipleCatch {

    public static void main(String[] args) {
        try {
            int[] values = {10};
            int number = Integer.parseInt("ABC");
            System.out.println(values[2] + number);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index.");
        }
    }
}
