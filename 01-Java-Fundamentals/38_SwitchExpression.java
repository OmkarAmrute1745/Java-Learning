/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Switch Expression
 *
 * What is it?
 * A switch expression can return a value directly.
 *
 * Why do we need it?
 * It was introduced as a modern Java feature and can make simple selection logic shorter.
 *
 * Simple real-world example:
 * The arrow syntax avoids accidental fall-through between cases.
 *
 * Important syntax / idea:
 * The `yield` keyword is used when a block-style switch expression needs to produce a value.
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
class Concept38_SwitchExpression {
    public static void main(String[] args) {
        int day = 2;

        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };

        System.out.println(name);
    }
}
