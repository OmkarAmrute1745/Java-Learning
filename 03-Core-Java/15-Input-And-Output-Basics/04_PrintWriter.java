/**
 * Topic: PrintWriter
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_PrintWriter {

    public static void main(String[] args) {
        java.io.PrintWriter writer = new java.io.PrintWriter(System.out);
        writer.println("Java output");
        writer.flush();
    }
}
