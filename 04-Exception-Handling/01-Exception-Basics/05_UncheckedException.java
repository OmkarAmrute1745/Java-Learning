/**
 * Topic: UncheckedException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_UncheckedException {

    public static void main(String[] args) {
        try {
            int[] values = {10, 20};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Unchecked exception handled.");
        }
    }
}
