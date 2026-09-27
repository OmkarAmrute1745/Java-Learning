/**
 * Topic: FinallyExecution
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_FinallyExecution {

    public static void main(String[] args) {
        try {
            System.out.println("Opening resource");
        } finally {
            System.out.println("Cleanup code");
        }
    }
}
