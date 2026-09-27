/**
 * Topic: LoggingException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_LoggingException {

    public static void main(String[] args) {
        try {
            throw new IllegalStateException("Something went wrong");
        } catch (Exception exception) {
            java.util.logging.Logger.getLogger(Concept04_LoggingException.class.getName())
                .severe(exception.getMessage());
        }
    }
}
