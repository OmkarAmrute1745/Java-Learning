/*
 * JAVA FUNDAMENTALS
 * CONCEPT: String
 *
 * What is it?
 * String represents text in Java and is an object, not a primitive.
 *
 * Why do we need it?
 * Strings are used everywhere: names, messages, IDs, JSON values, and log messages.
 *
 * Simple real-world example:
 * A customer name such as "Omkar" is stored in a String.
 *
 * Important syntax / idea:
 * Common operations include length(), equals(), toUpperCase(), and substring().
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
class Concept11_String {
    public static void main(String[] args) {
        String name = "Omkar";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Contains 'kar': " + name.contains("kar"));
    }
}
