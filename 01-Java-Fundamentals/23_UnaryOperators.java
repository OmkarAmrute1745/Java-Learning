/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Unary Operators
 *
 * What is it?
 * Unary operators work with one operand.
 *
 * Why do we need it?
 * They are commonly used to increment, decrement, negate, or invert a value.
 *
 * Simple real-world example:
 * Important operators include ++, --, +, -, and !.
 *
 * Important syntax / idea:
 * Be careful with the difference between prefix and postfix increment.
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
class Concept23_UnaryOperators {
    public static void main(String[] args) {
        int count = 5;

        System.out.println("Before: " + count);
        System.out.println("Post-increment: " + count++);
        System.out.println("After: " + count);
        System.out.println("Pre-increment: " + ++count);
        System.out.println("Negative: " + (-count));
    }
}
