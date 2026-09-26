/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array Traversal
 *
 * What is it?
 * Array traversal means visiting array elements one by one.
 *
 * Why do we need it?
 * Traversal is used for searching, printing, calculating totals, and transforming data.
 *
 * Simple real-world example:
 * A normal for loop gives access to both the index and value.
 *
 * Important syntax / idea:
 * The enhanced for loop is convenient when the index is not needed.
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
class Concept58_ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
