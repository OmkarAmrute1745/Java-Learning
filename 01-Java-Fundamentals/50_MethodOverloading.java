/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Method Overloading
 *
 * What is it?
 * Method overloading means defining multiple methods with the same name but different parameter lists.
 *
 * Why do we need it?
 * It provides convenient ways to perform a similar operation with different inputs.
 *
 * Simple real-world example:
 * Changing only the return type is not enough to overload a method.
 *
 * Important syntax / idea:
 * Overloading is resolved at compile time.
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
class Concept50_MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(1, 2, 3));
    }
}
