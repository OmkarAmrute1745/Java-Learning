/**
 * Topic: MultipleResources
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_MultipleResources {

    public static void main(String[] args) {
        try (java.io.StringReader first = new java.io.StringReader("A");
             java.io.StringReader second = new java.io.StringReader("B")) {
            System.out.println(first.read());
            System.out.println(second.read());
        } catch (java.io.IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
