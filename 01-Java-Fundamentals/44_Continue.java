/*
 * JAVA FUNDAMENTALS
 * CONCEPT: continue
 *
 * What is it?
 * continue skips the rest of the current loop iteration and moves to the next iteration.
 *
 * Why do we need it?
 * It is useful when certain values should be ignored.
 *
 * Simple real-world example:
 * For example, skip even numbers while processing a list of numbers.
 *
 * Important syntax / idea:
 * continue does not end the whole loop.
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
class Concept44_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println("Odd: " + i);
        }
    }
}
