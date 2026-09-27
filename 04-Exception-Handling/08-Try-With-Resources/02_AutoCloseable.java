/**
 * Topic: AutoCloseable
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Resource implements AutoCloseable {
    public void close() { System.out.println("Resource closed"); }
}

class Concept02_AutoCloseable {

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("Using resource");
        }
    }
}
