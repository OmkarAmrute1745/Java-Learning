/**
 * Topic: ExceptionVsError
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_ExceptionVsError {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getClass().getSimpleName());
        }
        System.out.println("Errors are different from application exceptions.");
    }
}
