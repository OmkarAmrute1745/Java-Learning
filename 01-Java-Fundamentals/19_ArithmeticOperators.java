/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Arithmetic Operators
 *
 * What is it?
 * Arithmetic operators perform mathematical calculations.
 *
 * Why do we need it?
 * They are used for totals, counters, percentages, and calculations in business logic.
 *
 * Simple real-world example:
 * The main operators are +, -, *, /, and %.
 *
 * Important syntax / idea:
 * Remember that integer division removes the decimal part.
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
class Concept19_ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
