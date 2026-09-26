/*
 * JAVA FUNDAMENTALS
 * CONCEPT: if-else Statement
 *
 * What is it?
 * if-else chooses between two paths.
 *
 * Why do we need it?
 * The if block runs when the condition is true; otherwise the else block runs.
 *
 * Simple real-world example:
 * It is useful when exactly two outcomes matter.
 *
 * Important syntax / idea:
 * Example: check whether a user is an adult or a minor.
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
class Concept34_IfElse {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}
