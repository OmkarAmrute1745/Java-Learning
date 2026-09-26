/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array Declaration
 *
 * What is it?
 * An array variable is declared with a type followed by `[]`.
 *
 * Why do we need it?
 * Declaration creates a reference variable; the actual array can be created later.
 *
 * Simple real-world example:
 * The array type defines what kind of values it can store.
 *
 * Important syntax / idea:
 * Examples: int[], String[], double[].
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
class Concept56_ArrayDeclaration {
    public static void main(String[] args) {
        int[] numbers;
        String[] names;

        numbers = new int[3];
        names = new String[2];

        System.out.println(numbers.length);
        System.out.println(names.length);
    }
}
