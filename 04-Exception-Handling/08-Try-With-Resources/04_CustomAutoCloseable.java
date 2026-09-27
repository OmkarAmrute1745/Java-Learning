/**
 * Topic: CustomAutoCloseable
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Connection implements AutoCloseable {
    public void close() { System.out.println("Connection closed"); }
}

class Concept04_CustomAutoCloseable {

    public static void main(String[] args) {
        try (Connection connection = new Connection()) {
            System.out.println("Connection is active");
        }
    }
}
