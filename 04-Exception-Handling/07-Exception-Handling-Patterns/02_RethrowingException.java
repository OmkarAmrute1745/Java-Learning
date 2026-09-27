/**
 * Topic: RethrowingException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void process() {
        try { throw new IllegalStateException("Original problem"); }
        catch (IllegalStateException exception) { throw exception; }
    }

class Concept02_RethrowingException {

    public static void main(String[] args) {
        try {
            process();
        } catch (Exception exception) {
            System.out.println("Handled at boundary: " + exception.getMessage());
        }
    }
}
