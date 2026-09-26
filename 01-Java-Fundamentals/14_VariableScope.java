/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Variable Scope
 *
 * What is it?
 * Scope defines where a variable can be accessed.
 *
 * Why do we need it?
 * Scope prevents unrelated code from accidentally using local data.
 *
 * Simple real-world example:
 * A local variable inside a method normally cannot be accessed directly from another method.
 *
 * Important syntax / idea:
 * Common scopes include local, parameter, instance, and class-level variables.
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
class Concept14_VariableScope {
    static int classValue = 100; // Class-level variable.

    static void showScope(int parameter) {
        int localValue = 20; // Only available inside this method.
        System.out.println(classValue);
        System.out.println(parameter);
        System.out.println(localValue);
    }

    public static void main(String[] args) {
        showScope(10);
    }
}
