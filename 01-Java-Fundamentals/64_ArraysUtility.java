/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Arrays Utility Class
 *
 * What is it?
 * java.util.Arrays provides useful static methods for working with arrays.
 *
 * Why do we need it?
 * It can print arrays, sort them, compare them, fill them, and create copies.
 *
 * Simple real-world example:
 * Using the utility methods avoids writing common array code repeatedly.
 *
 * Important syntax / idea:
 * Important methods include toString, sort, equals, fill, and copyOf.
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
import java.util.Arrays;

class Concept64_ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 20};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Contains same values after copy: "
                + Arrays.equals(numbers, Arrays.copyOf(numbers, numbers.length)));
    }
}
