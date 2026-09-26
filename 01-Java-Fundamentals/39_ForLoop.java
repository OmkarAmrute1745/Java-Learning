/*
 * JAVA FUNDAMENTALS
 * CONCEPT: for Loop
 *
 * What is it?
 * A for loop repeats a block while a loop condition remains true.
 *
 * Why do we need it?
 * It is useful when the number of iterations is known or controlled by a counter.
 *
 * Simple real-world example:
 * A for loop usually has initialization, condition, and update parts.
 *
 * Important syntax / idea:
 * Example: print numbers from 1 to 5.
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
class Concept39_ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
