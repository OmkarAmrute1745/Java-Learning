/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Escape Characters
 *
 * What is it?
 * Escape sequences let a String represent special characters.
 *
 * Why do we need it?
 * They are useful for new lines, tabs, quotes, and backslashes.
 *
 * Simple real-world example:
 * Common sequences are `\n`, `\t`, `\"`, `\\`, and `\'`.
 *
 * Important syntax / idea:
 * They help format text without breaking Java String syntax.
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
class Concept32_EscapeCharacters {
    public static void main(String[] args) {
        System.out.println("Line 1\nLine 2");
        System.out.println("Name:\tOmkar");
        System.out.println("He said: \"Hello Java!\"");
        System.out.println("Path: C:\\Java\\Learning");
    }
}
