/*
 * JAVA FUNDAMENTALS
 * CONCEPT: else-if Ladder
 *
 * What is it?
 * An else-if ladder checks multiple conditions in order.
 *
 * Why do we need it?
 * It is useful when there are several mutually exclusive ranges or states.
 *
 * Simple real-world example:
 * The first matching condition is executed and the remaining conditions are skipped.
 *
 * Important syntax / idea:
 * For many fixed choices, switch can sometimes be clearer.
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
class Concept35_ElseIf {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 75) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
