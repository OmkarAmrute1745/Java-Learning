/*
 * JAVA FUNDAMENTALS
 * CONCEPT: static Methods
 *
 * What is it?
 * A static method belongs to the class rather than to an individual object.
 *
 * Why do we need it?
 * Static methods can be called using the class name without creating an object.
 *
 * Simple real-world example:
 * They are suitable for behavior that does not depend on object-specific state.
 *
 * Important syntax / idea:
 * A static method cannot directly access a non-static instance field.
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
class Concept51_StaticMethods {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = Concept51_StaticMethods.square(5);
        System.out.println(result);
    }
}
