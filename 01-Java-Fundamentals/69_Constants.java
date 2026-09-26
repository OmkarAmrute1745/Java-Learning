/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Constants
 *
 * What is it?
 * A constant is a value intended not to change after initialization.
 *
 * Why do we need it?
 * In Java, constants are commonly represented by `static final` fields.
 *
 * Simple real-world example:
 * They avoid magic numbers and provide one meaningful name for a shared fixed value.
 *
 * Important syntax / idea:
 * Use uppercase with underscores for constant names.
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
class Concept69_Constants {
    static final double TAX_RATE = 0.18;
    static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args) {
        double amount = 1000;
        double tax = amount * TAX_RATE;

        System.out.println("Tax: " + tax);
        System.out.println("Max attempts: " + MAX_LOGIN_ATTEMPTS);
    }
}
