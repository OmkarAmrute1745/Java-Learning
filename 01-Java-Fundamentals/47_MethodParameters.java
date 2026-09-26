/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Method Parameters
 *
 * What is it?
 * Parameters allow a method to receive input values from its caller.
 *
 * Why do we need it?
 * They make methods reusable for different data.
 *
 * Simple real-world example:
 * For example, one greeting method can accept different names.
 *
 * Important syntax / idea:
 * Arguments are the actual values passed to parameters.
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
class Concept47_MethodParameters {
    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greet("Omkar");
        greet("Java Developer");
    }
}
