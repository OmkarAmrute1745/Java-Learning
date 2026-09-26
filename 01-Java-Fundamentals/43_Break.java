/*
 * JAVA FUNDAMENTALS
 * CONCEPT: break
 *
 * What is it?
 * break immediately exits the nearest loop or switch.
 *
 * Why do we need it?
 * It is useful when the required item has been found and continuing is unnecessary.
 *
 * Simple real-world example:
 * For example, stop searching an array once the target is found.
 *
 * Important syntax / idea:
 * break only exits the nearest enclosing loop or switch.
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
class Concept43_Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
