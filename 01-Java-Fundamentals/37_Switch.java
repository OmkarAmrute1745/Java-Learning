/*
 * JAVA FUNDAMENTALS
 * CONCEPT: switch Statement
 *
 * What is it?
 * switch selects a block based on the value of an expression.
 *
 * Why do we need it?
 * It is useful for fixed choices such as menu options, status codes, or days.
 *
 * Simple real-world example:
 * Traditional switch uses case labels and usually break statements.
 *
 * Important syntax / idea:
 * A default case handles values that do not match.
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
class Concept37_Switch {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
