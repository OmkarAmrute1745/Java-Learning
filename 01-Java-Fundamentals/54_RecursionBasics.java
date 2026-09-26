/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Recursion Basics
 *
 * What is it?
 * Recursion is when a method calls itself to solve a smaller version of the same problem.
 *
 * Why do we need it?
 * Every useful recursive method needs a base case to stop the calls.
 *
 * Simple real-world example:
 * Recursion is common in tree traversal, divide-and-conquer algorithms, and some mathematical problems.
 *
 * Important syntax / idea:
 * Without a base case, recursion can eventually cause StackOverflowError.
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
class Concept54_RecursionBasics {
    static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case.
        }

        return n * factorial(n - 1); // Recursive call.
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }
}
