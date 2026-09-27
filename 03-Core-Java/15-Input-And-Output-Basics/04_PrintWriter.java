/**
 * Topic: 04 PrintWriter
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 04PrintWriter {

    public static void main(String[] args) {
        java.io.PrintWriter writer = new java.io.PrintWriter(System.out);
        writer.println("Java output");
        writer.flush();
    }
}
