/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Identifiers
 *
 * What is it?
 * An identifier is a name given to a class, method, variable, parameter, or other program element.
 *
 * Why do we need it?
 * Identifiers make code readable and let Java refer to program elements.
 *
 * Simple real-world example:
 * They cannot start with a digit and cannot be reserved keywords.
 *
 * Important syntax / idea:
 * Java convention uses PascalCase for classes and camelCase for methods and variables.
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
class Concept67_Identifiers {
    static int accountBalance = 1000;

    static void printBalance() {
        System.out.println(accountBalance);
    }

    public static void main(String[] args) {
        printBalance();
    }
}
