/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Assignment Operators
 *
 * What is it?
 * Assignment operators store or update values in variables.
 *
 * Why do we need it?
 * They make repeated updates shorter and clearer.
 *
 * Simple real-world example:
 * Besides `=`, Java provides `+=`, `-=`, `*=`, `/=`, and `%=`.
 *
 * Important syntax / idea:
 * Example: `total += 10` means `total = total + 10`.
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
class Concept22_AssignmentOperators {
    public static void main(String[] args) {
        int total = 100;

        total += 20;
        total -= 10;
        total *= 2;
        total /= 2;

        System.out.println("Total: " + total);
    }
}
