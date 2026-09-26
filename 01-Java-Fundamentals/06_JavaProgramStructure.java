/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Java Program Structure
 *
 * What is it?
 * A Java program commonly contains a class, methods, variables, statements, and comments.
 *
 * Why do we need it?
 * Understanding the structure makes larger programs easier to read and maintain.
 *
 * Simple real-world example:
 * A backend service also uses the same basic building blocks, although frameworks add many more classes and annotations.
 *
 * Important syntax / idea:
 * Class -> method -> statements -> expressions.
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
class Concept06_JavaProgramStructure {
    // Field: data belonging to this class.
    static String applicationName = "Java Learning";

    // Method: behavior belonging to the class.
    static void printName() {
        System.out.println(applicationName);
    }

    public static void main(String[] args) {
        printName();
    }
}
