/**
 * Topic: WrappingException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void service() {
        try { throw new java.io.IOException("I/O failure"); }
        catch (java.io.IOException exception) { throw new RuntimeException("Service exception", exception); }
    }

class Concept03_WrappingException {

    public static void main(String[] args) {
        try {
            service();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause().getClass().getSimpleName());
        }
    }
}
