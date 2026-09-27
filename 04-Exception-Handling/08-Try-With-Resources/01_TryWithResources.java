/**
 * Topic: TryWithResources
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_TryWithResources {

    public static void main(String[] args) {
        try (java.io.StringReader reader = new java.io.StringReader("Java")) {
            System.out.println(reader.read());
        } catch (java.io.IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
