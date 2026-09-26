/*
 * JAVA FUNDAMENTALS
 * CONCEPT: while Loop
 *
 * What is it?
 * A while loop repeats as long as its condition is true.
 *
 * Why do we need it?
 * It is useful when the number of iterations is not known in advance.
 *
 * Simple real-world example:
 * The condition is checked before each iteration.
 *
 * Important syntax / idea:
 * Make sure the loop state changes, otherwise an infinite loop can occur.
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
class Concept40_WhileLoop {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}
