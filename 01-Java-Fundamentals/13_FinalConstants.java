/*
 * JAVA FUNDAMENTALS
 * CONCEPT: final Constants
 *
 * What is it?
 * The `final` keyword prevents a variable from being assigned a new value after initialization.
 *
 * Why do we need it?
 * Constants are useful when a value should remain fixed during program execution.
 *
 * Simple real-world example:
 * For example, a maximum retry count can be defined once and reused.
 *
 * Important syntax / idea:
 * Common convention: constants use UPPER_SNAKE_CASE.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values to see what happens.
 * - Read the comments in the code; they explain the important parts.
 *
 * Interview note:
 * Be able to explain this concept in simple words and give one
 * practical example. Also understand the difference between similar
 * concepts where applicable.
 *
 * Example output:
 * The exact output depends on the values used in the program.
 */
class Concept13_FinalConstants {
    static final int MAX_RETRIES = 3;

    public static void main(String[] args) {
        System.out.println("Maximum retries: " + MAX_RETRIES);
        // MAX_RETRIES = 5; // Compile-time error.
    }
}
