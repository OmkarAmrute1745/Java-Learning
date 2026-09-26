/*
 * JAVA FUNDAMENTALS
 * CONCEPT: return
 *
 * What is it?
 * return sends a value back from a method or immediately exits a void method.
 *
 * Why do we need it?
 * It is needed when a method calculates something that another part of the program must use.
 *
 * Simple real-world example:
 * For example, an add method can return the calculated total to its caller.
 *
 * Important syntax / idea:
 * A non-void method must return a compatible value on every reachable path.
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
class Concept45_Return {
    public static void main(String[] args) {
        int result = add(10, 20);

        System.out.println("Result: " + result);
    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
