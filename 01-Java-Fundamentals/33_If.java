/*
 * JAVA FUNDAMENTALS
 * CONCEPT: if Statement
 *
 * What is it?
 * The if statement runs a block only when a condition is true.
 *
 * Why do we need it?
 * It is the basic decision-making statement in Java.
 *
 * Simple real-world example:
 * For example, a system can process a payment only when the amount is greater than zero.
 *
 * Important syntax / idea:
 * Syntax: `if (condition) { ... }`.
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
class Concept33_If {
    public static void main(String[] args) {
        int amount = 500;

        if (amount > 0) {
            System.out.println("Payment amount is valid.");
        }
    }
}
