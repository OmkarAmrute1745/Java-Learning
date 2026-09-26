/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Scope
 *
 * What is it?
 * Scope determines where a variable can be accessed.
 *
 * Why do we need it?
 * A local variable exists only inside its method or block. An instance field belongs to an object, and a static field belongs to the class.
 *
 * Simple real-world example:
 * Smaller scopes reduce accidental access and make code easier to reason about.
 *
 * Important syntax / idea:
 * A variable declared inside a block cannot be used outside that block.
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
class Concept70_Scope {
    static int classValue = 100;

    static void show() {
        int methodValue = 20;

        if (methodValue > 10) {
            int blockValue = 30;
            System.out.println(classValue);
            System.out.println(methodValue);
            System.out.println(blockValue);
        }

        // blockValue is not accessible here.
    }

    public static void main(String[] args) {
        show();
    }
}
