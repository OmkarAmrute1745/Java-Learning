/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Logical Operators
 *
 * What is it?
 * Logical operators combine boolean conditions.
 *
 * Why do we need it?
 * They are useful when a rule depends on more than one condition.
 *
 * Simple real-world example:
 * `&&` means AND, `||` means OR, and `!` means NOT.
 *
 * Important syntax / idea:
 * Java short-circuits `&&` and `||` when the result is already known.
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
class Concept21_LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean hasId = true;

        boolean allowed = age >= 18 && hasId;
        boolean specialCase = age < 18 || hasId;
        boolean notAdult = !(age >= 18);

        System.out.println("Allowed: " + allowed);
        System.out.println("Special case: " + specialCase);
        System.out.println("Not adult: " + notAdult);
    }
}
