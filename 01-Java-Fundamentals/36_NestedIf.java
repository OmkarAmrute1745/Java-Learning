/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Nested if
 *
 * What is it?
 * A nested if is an if statement inside another if statement.
 *
 * Why do we need it?
 * It is useful when the second decision should only be checked after the first condition succeeds.
 *
 * Simple real-world example:
 * For example, check whether a user is logged in before checking whether the user is an admin.
 *
 * Important syntax / idea:
 * Avoid deeply nested conditions when the logic can be simplified.
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
class Concept36_NestedIf {
    public static void main(String[] args) {
        boolean loggedIn = true;
        boolean admin = true;

        if (loggedIn) {
            if (admin) {
                System.out.println("Admin dashboard");
            }
        }
    }
}
