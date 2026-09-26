/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Blocks
 *
 * What is it?
 * A block is a group of statements surrounded by curly braces.
 *
 * Why do we need it?
 * Blocks create scope and are used in methods, loops, conditions, and classes.
 *
 * Simple real-world example:
 * Variables declared inside a block are normally available only within that block.
 *
 * Important syntax / idea:
 * Understanding blocks helps explain variable scope and control flow.
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
class Concept71_Blocks {
    public static void main(String[] args) {
        {
            int value = 10;
            System.out.println("Inside block: " + value);
        }

        // value is not accessible here because its block ended.
        System.out.println("Block finished.");
    }
}
