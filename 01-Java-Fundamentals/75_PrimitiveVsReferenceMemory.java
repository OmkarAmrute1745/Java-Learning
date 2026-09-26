/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Primitive vs Reference Values
 *
 * What is it?
 * A primitive variable holds a primitive value. A reference variable holds a reference to an object or array.
 *
 * Why do we need it?
 * When a reference is copied, both variables can refer to the same object.
 *
 * Simple real-world example:
 * This difference is important when understanding assignments, method calls, and object mutation.
 *
 * Important syntax / idea:
 * Do not assume that assigning an object variable creates a new object.
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
class Concept75_PrimitiveVsReferenceMemory {
    static class Account {
        int balance;

        Account(int balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        Account first = new Account(100);
        Account second = first;
        second.balance = 500;

        System.out.println("Primitive a: " + a);
        System.out.println("Primitive b: " + b);
        System.out.println("First account balance: " + first.balance);
    }
}
