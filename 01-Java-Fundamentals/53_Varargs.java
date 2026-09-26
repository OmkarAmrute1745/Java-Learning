/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Varargs
 *
 * What is it?
 * Varargs allow a method to accept zero or more arguments of the same type.
 *
 * Why do we need it?
 * They are useful when the number of inputs is flexible.
 *
 * Simple real-world example:
 * Inside the method, a varargs parameter behaves like an array.
 *
 * Important syntax / idea:
 * Only one varargs parameter is allowed, and it must be the last parameter.
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
class Concept53_Varargs {
    static int sum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(10, 20, 30, 40));
    }
}
