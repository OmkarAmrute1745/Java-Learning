/**
 * Topic: CheckedExceptionPropagation
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void firstMethod() throws java.io.IOException { secondMethod(); }
    static void secondMethod() throws java.io.IOException { throw new java.io.IOException("File operation failed"); }

class Concept02_CheckedExceptionPropagation {

    public static void main(String[] args) {
        try {
            firstMethod();
        } catch (java.io.IOException exception) {
            System.out.println("Checked exception handled at caller.");
        }
    }
}
