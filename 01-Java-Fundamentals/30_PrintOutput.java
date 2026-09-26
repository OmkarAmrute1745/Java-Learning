/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Print Output
 *
 * What is it?
 * Java provides System.out.print, println, and printf for console output.
 *
 * Why do we need it?
 * Output is useful for displaying results, debugging simple programs, and command-line applications.
 *
 * Simple real-world example:
 * println adds a new line, print does not, and printf supports formatted output.
 *
 * Important syntax / idea:
 * Choose the method that makes the output easiest to read.
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
class Concept30_PrintOutput {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println("Java");

        String name = "Omkar";
        int age = 25;

        System.out.printf("Name: %s, Age: %d%n", name, age);
    }
}
