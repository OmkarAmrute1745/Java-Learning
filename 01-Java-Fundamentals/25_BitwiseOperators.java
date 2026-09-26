/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Bitwise Operators
 *
 * What is it?
 * Bitwise operators work directly with individual bits of integer values.
 *
 * Why do we need it?
 * They are useful in low-level programming, flags, masks, and some performance-sensitive logic.
 *
 * Simple real-world example:
 * Important operators are &, |, ^, and ~.
 *
 * Important syntax / idea:
 * For example, 5 is binary 0101 and 3 is 0011.
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
class Concept25_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println("AND: " + (a & b)); // 0001 = 1
        System.out.println("OR: " + (a | b));  // 0111 = 7
        System.out.println("XOR: " + (a ^ b)); // 0110 = 6
        System.out.println("NOT: " + (~a));
    }
}
