/*
 * JAVA FUNDAMENTALS
 * CONCEPT: void Methods
 *
 * What is it?
 * A void method performs an action but does not return a value to its caller.
 *
 * Why do we need it?
 * It is useful for operations such as printing, updating state, or sending a message.
 *
 * Simple real-world example:
 * The method can still use `return;` to exit early.
 *
 * Important syntax / idea:
 * A void method cannot be used as a value in an expression.
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
class Concept49_VoidMethods {
    static void printStatus(boolean active) {
        if (!active) {
            return; // Exit early.
        }

        System.out.println("Account is active");
    }

    public static void main(String[] args) {
        printStatus(true);
    }
}
