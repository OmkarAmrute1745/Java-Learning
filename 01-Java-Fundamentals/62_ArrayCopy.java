/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Array Copy
 *
 * What is it?
 * Array copying creates another array containing the values or references from the original array.
 *
 * Why do we need it?
 * Simple assignment such as `copy = original` does not create a new array; both variables refer to the same array.
 *
 * Simple real-world example:
 * Use `Arrays.copyOf`, `System.arraycopy`, or a loop when you need a separate array.
 *
 * Important syntax / idea:
 * For object arrays, copying is shallow: the object references are copied.
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

class Concept62_ArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};

        int[] copy = Arrays.copyOf(original, original.length);
        copy[0] = 99;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
    }
}
