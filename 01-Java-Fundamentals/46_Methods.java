/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Methods
 *
 * What is it?
 * A method is a named block of code that performs a task.
 *
 * Why do we need it?
 * Methods reduce duplication and make programs easier to organize and test.
 *
 * Simple real-world example:
 * A backend service is built from many methods that each perform focused operations.
 *
 * Important syntax / idea:
 * A method can have parameters and can return a value.
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
class Concept46_Methods {
    static void greet() {
        System.out.println("Hello from a method");
    }

    public static void main(String[] args) {
        greet();
        greet();
    }
}
