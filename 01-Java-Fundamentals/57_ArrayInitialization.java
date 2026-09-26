/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array Initialization
 *
 * What is it?
 * Array initialization gives an array its size and/or starting values.
 *
 * Why do we need it?
 * You can use an array literal when the values are already known, or new type[size] when values will be assigned later.
 *
 * Simple real-world example:
 * Uninitialized numeric array elements receive default zero values.
 *
 * Important syntax / idea:
 * Reference array elements initially contain null.
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
class Concept57_ArrayInitialization {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        int[] scores = new int[3];
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 70;

        System.out.println(numbers[1]);
        System.out.println(scores[2]);
    }
}
