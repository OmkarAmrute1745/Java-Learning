/**
 * Topic: ThrowsKeyword
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void readFile() throws java.io.IOException {
        java.io.FileReader reader = new java.io.FileReader("sample.txt");
        reader.close();
    }

class Concept02_ThrowsKeyword {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (java.io.IOException exception) {
            System.out.println("Handled: " + exception.getMessage());
        }
    }
}
