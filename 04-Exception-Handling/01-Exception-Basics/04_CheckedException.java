/**
 * Topic: CheckedException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_CheckedException {

    public static void main(String[] args) {
        try {
            java.io.FileReader reader = new java.io.FileReader("sample.txt");
            reader.close();
        } catch (java.io.IOException exception) {
            System.out.println("Checked exception handled: " + exception.getClass().getSimpleName());
        }
    }
}
