/*
 * JAVA FUNDAMENTALS
 * CONCEPT: do-while Loop
 *
 * What is it?
 * A do-while loop executes its body at least once and checks the condition afterward.
 *
 * Why do we need it?
 * It is useful for menus or actions that must happen before checking whether to repeat.
 *
 * Simple real-world example:
 * This is the key difference from while: do-while always executes once.
 *
 * Important syntax / idea:
 * Syntax ends with a semicolon after the condition.
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
class Concept41_DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 3);
    }
}
