/**
 * Topic: ExceptionPropagationFlow
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void service() { repository(); }
    static void repository() { throw new IllegalStateException("Repository failure"); }

class Concept04_ExceptionPropagationFlow {

    public static void main(String[] args) {
        try {
            service();
        } catch (Exception exception) {
            System.out.println("Controller-level handling: " + exception.getMessage());
        }
    }
}
