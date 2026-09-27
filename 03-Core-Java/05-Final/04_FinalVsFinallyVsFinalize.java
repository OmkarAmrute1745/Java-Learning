/**
 * Topic: FinalVsFinallyVsFinalize
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_FinalVsFinallyVsFinalize {

    public static void main(String[] args) {
        final int value = 10;
        try {
            System.out.println(value);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
