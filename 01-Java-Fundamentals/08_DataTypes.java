/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Data Types
 *
 * What is it?
 * A data type tells Java what kind of value a variable can store.
 *
 * Why do we need it?
 * Java is statically typed, so the type is known and checked by the compiler.
 *
 * Simple real-world example:
 * For example, an amount may use double or BigDecimal later, while a count can use int.
 *
 * Important syntax / idea:
 * Examples: int, double, char, boolean, String, arrays, and objects.
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
class Concept08_DataTypes {
    public static void main(String[] args) {
        int count = 10;
        double price = 99.50;
        char grade = 'A';
        boolean active = true;
        String name = "Java";

        System.out.println(count);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(active);
        System.out.println(name);
    }
}
