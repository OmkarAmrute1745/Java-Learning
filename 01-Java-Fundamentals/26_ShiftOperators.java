/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Shift Operators
 *
 * What is it?
 * Shift operators move the bits of an integer left or right.
 *
 * Why do we need it?
 * They can be used for bit manipulation and low-level calculations.
 *
 * Simple real-world example:
 * `<<` shifts left, `>>` shifts right with sign extension, and `>>>` shifts right with zero fill.
 *
 * Important syntax / idea:
 * For positive integers, shifting left by one position is similar to multiplying by two.
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
class Concept26_ShiftOperators {
    public static void main(String[] args) {
        int value = 8; // Binary: 1000

        System.out.println("Left shift: " + (value << 1));
        System.out.println("Right shift: " + (value >> 1));
        System.out.println("Unsigned right shift: " + (value >>> 1));
    }
}
