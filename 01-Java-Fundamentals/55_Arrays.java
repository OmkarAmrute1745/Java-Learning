/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Arrays
 *
 * What is it?
 * An array stores a fixed-size sequence of values of the same type.
 *
 * Why do we need it?
 * Arrays are useful when the number of elements is known and indexed access is needed.
 *
 * Simple real-world example:
 * Array indexes start at zero.
 *
 * Important syntax / idea:
 * The array size cannot change after creation.
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
class Concept55_Arrays {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85};

        System.out.println("First mark: " + marks[0]);
        System.out.println("Last mark: " + marks[marks.length - 1]);
    }
}
