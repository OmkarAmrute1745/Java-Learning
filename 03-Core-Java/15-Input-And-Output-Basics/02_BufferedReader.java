/**
 * Topic: BufferedReader
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_BufferedReader {

    public static void main(String[] args) {
        try {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println("Enter text:");
            System.out.println(reader.readLine());
        } catch (java.io.IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
