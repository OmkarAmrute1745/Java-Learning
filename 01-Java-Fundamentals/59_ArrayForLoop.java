/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array with for Loop
 *
 * What is it?
 * A for loop can traverse an array using its index.
 *
 * Why do we need it?
 * The loop condition should normally use `i < array.length` so the last valid index is not exceeded.
 *
 * Simple real-world example:
 * This pattern is important for searching and updating arrays.
 *
 * Important syntax / idea:
 * Valid indexes range from 0 to length - 1.
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
class Concept59_ArrayForLoop {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
