/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Type Casting
 *
 * What is it?
 * Type casting converts a value from one data type to another compatible type.
 *
 * Why do we need it?
 * It is common when calculations or APIs require a different numeric type.
 *
 * Simple real-world example:
 * Widening conversion is generally automatic; narrowing conversion needs an explicit cast.
 *
 * Important syntax / idea:
 * Example: int -> double is widening; double -> int is narrowing.
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
class Concept16_TypeCasting {
    public static void main(String[] args) {
        int number = 10;
        double widened = number; // int -> double automatically.

        double price = 99.99;
        int narrowed = (int) price; // Decimal part is removed.

        System.out.println(widened);
        System.out.println(narrowed);
    }
}
