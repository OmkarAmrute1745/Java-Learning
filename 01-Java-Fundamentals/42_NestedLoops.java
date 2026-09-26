/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Nested Loops
 *
 * What is it?
 * A nested loop is a loop inside another loop.
 *
 * Why do we need it?
 * It is useful for tables, matrices, patterns, and two-dimensional data.
 *
 * Simple real-world example:
 * For every iteration of the outer loop, the inner loop completes its iterations.
 *
 * Important syntax / idea:
 * Be careful with nested loops because time complexity can grow quickly.
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
class Concept42_NestedLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 3; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
