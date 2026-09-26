/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Multidimensional Arrays
 *
 * What is it?
 * A multidimensional array is an array whose elements are themselves arrays.
 *
 * Why do we need it?
 * A two-dimensional array is often used to represent rows and columns such as a table or matrix.
 *
 * Simple real-world example:
 * Java technically supports arrays of arrays, so rows can even have different lengths.
 *
 * Important syntax / idea:
 * Use nested loops to process rows and columns.
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
class Concept61_MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
