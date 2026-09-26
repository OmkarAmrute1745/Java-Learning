/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Comments
 *
 * What is it?
 * Comments are notes in source code that are ignored by the Java compiler.
 *
 * Why do we need it?
 * They explain intent, tricky logic, or important decisions for humans reading the code.
 *
 * Simple real-world example:
 * Use comments to clarify why something is done, not to describe every obvious line.
 *
 * Important syntax / idea:
 * Java supports single-line `//` and block `/* */` comments; documentation commonly uses `/** */`.
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
class Concept65_Comments {
    public static void main(String[] args) {
        // This is a single-line comment.
        int age = 25;

        /*
         * This is a block comment.
         * It can span multiple lines.
         */
        System.out.println(age);
    }
}
