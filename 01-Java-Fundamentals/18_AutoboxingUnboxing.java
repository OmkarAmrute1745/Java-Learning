/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Autoboxing and Unboxing
 *
 * What is it?
 * Autoboxing converts a primitive to its wrapper object. Unboxing converts a wrapper object back to a primitive.
 *
 * Why do we need it?
 * Java performs these conversions automatically in many situations.
 *
 * Simple real-world example:
 * This makes collections such as List<Integer> easier to use.
 *
 * Important syntax / idea:
 * int -> Integer is boxing; Integer -> int is unboxing.
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
class Concept18_AutoboxingUnboxing {
    public static void main(String[] args) {
        int primitive = 10;
        Integer object = primitive; // Autoboxing.

        Integer anotherObject = 20;
        int anotherPrimitive = anotherObject; // Unboxing.

        System.out.println(object);
        System.out.println(anotherPrimitive);
    }
}
