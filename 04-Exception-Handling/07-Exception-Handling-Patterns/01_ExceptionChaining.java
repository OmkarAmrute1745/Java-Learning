/**
 * Topic: ExceptionChaining
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void process() {
        try { throw new java.io.IOException("Database/file failure"); }
        catch (java.io.IOException exception) { throw new RuntimeException("Service failed", exception); }
    }

class Concept01_ExceptionChaining {

    public static void main(String[] args) {
        try {
            process();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Cause: " + exception.getCause().getMessage());
        }
    }
}
