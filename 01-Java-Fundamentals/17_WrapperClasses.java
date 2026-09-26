/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Wrapper Classes
 *
 * What is it?
 * Wrapper classes represent primitive values as objects.
 *
 * Why do we need it?
 * They are needed when an API requires objects, such as many collection types.
 *
 * Simple real-world example:
 * For example, `ArrayList<Integer>` stores Integer objects rather than primitive int values.
 *
 * Important syntax / idea:
 * Examples: Integer, Long, Double, Boolean, Character.
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
import java.util.ArrayList;

class Concept17_WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // int is converted to Integer automatically.
        numbers.add(20);

        System.out.println(numbers);
    }
}
