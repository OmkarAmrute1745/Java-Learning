/**
 * Topic: FileProcessingException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_FileProcessingException {

    public static void main(String[] args) {
        try (java.io.StringReader reader = new java.io.StringReader("Claims file")) {
            System.out.println(reader.read());
        } catch (java.io.IOException exception) {
            System.out.println("File processing failed: " + exception.getMessage());
        }
    }
}
