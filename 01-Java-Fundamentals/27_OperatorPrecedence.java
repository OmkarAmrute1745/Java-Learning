/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Operator Precedence
 *
 * What is it?
 * Operator precedence decides which operators Java evaluates first.
 *
 * Why do we need it?
 * It matters when an expression contains multiple operators.
 *
 * Simple real-world example:
 * Multiplication and division normally happen before addition and subtraction.
 *
 * Important syntax / idea:
 * Use parentheses when you want the order to be obvious.
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
class Concept27_OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println(result1); // 20
        System.out.println(result2); // 30
    }
}
