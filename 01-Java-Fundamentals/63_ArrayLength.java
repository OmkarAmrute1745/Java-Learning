/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array length
 *
 * What is it?
 * The `length` field gives the number of elements in an array.
 *
 * Why do we need it?
 * It is commonly used to control loops safely.
 *
 * Simple real-world example:
 * Array length is a field, not a method, so use `array.length`, not `array.length()`.
 *
 * Important syntax / idea:
 * For a two-dimensional array, `matrix.length` is the number of rows.
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
class Concept63_ArrayLength {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println("Length: " + numbers.length);
        System.out.println("Last value: " + numbers[numbers.length - 1]);
    }
}
