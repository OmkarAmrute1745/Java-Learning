/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Relational Operators
 *
 * What is it?
 * Relational operators compare two values and produce a boolean result.
 *
 * Why do we need it?
 * They are used in conditions such as age checks, validation, and business rules.
 *
 * Simple real-world example:
 * Operators include ==, !=, >, <, >=, and <=.
 *
 * Important syntax / idea:
 * The result is always true or false.
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
class Concept20_RelationalOperators {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(age == 25);
        System.out.println(age != 30);
        System.out.println(age > 18);
        System.out.println(age < 18);
        System.out.println(age >= 25);
        System.out.println(age <= 20);
    }
}
