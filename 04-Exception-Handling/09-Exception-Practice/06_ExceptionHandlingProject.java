/**
 * Topic: ExceptionHandlingProject
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class ClaimProcessor {
    static void process(String claim) {
        if (claim == null || claim.isBlank()) throw new IllegalArgumentException("Claim cannot be empty");
        System.out.println("Processing claim: " + claim);
    }
}

class Concept06_ExceptionHandlingProject {

    public static void main(String[] args) {
        try {
            ClaimProcessor.process("");
        } catch (IllegalArgumentException exception) {
            System.out.println("Claim processing failed: " + exception.getMessage());
        } finally {
            System.out.println("Processing completed.");
        }
    }
}
