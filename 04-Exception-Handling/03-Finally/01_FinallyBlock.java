/**
 * Topic: FinallyBlock
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_FinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } catch (Exception exception) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally always executes in normal completion of try/catch.");
        }
    }
}
