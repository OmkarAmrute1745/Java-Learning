/**
 * Topic: ExceptionHierarchy
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_ExceptionHierarchy {

    public static void main(String[] args) {
        Exception exception = new IllegalArgumentException("Invalid argument");
        System.out.println(exception instanceof RuntimeException);
        System.out.println(exception instanceof Exception);
    }
}
