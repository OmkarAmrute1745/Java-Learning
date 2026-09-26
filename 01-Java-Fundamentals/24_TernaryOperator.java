/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Ternary Operator
 *
 * What is it?
 * The ternary operator is a short form for choosing one of two values based on a condition.
 *
 * Why do we need it?
 * It is useful for simple conditions where a full if/else would be unnecessarily long.
 *
 * Simple real-world example:
 * Syntax: `condition ? valueIfTrue : valueIfFalse`.
 *
 * Important syntax / idea:
 * Avoid deeply nested ternary expressions because they reduce readability.
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
class Concept24_TernaryOperator {
    public static void main(String[] args) {
        int age = 20;

        String status = age >= 18 ? "Adult" : "Minor";

        System.out.println(status);
    }
}
