/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Enhanced for Loop
 *
 * What is it?
 * The enhanced for loop, also called for-each, visits every array element without exposing the index.
 *
 * Why do we need it?
 * It is cleaner when you only need the value.
 *
 * Simple real-world example:
 * Changing the loop variable does not replace the primitive array element.
 *
 * Important syntax / idea:
 * For object references, the loop variable receives a copy of the reference.
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
class Concept60_ArrayForEach {
    public static void main(String[] args) {
        String[] names = {"Omkar", "Ravi", "Amit"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
