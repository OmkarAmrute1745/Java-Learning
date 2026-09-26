/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Reference Data Types
 *
 * What is it?
 * A reference variable stores a reference to an object rather than a primitive value.
 *
 * Why do we need it?
 * Reference types allow Java programs to work with objects, arrays, and classes.
 *
 * Simple real-world example:
 * A Customer object variable can refer to a Customer object stored in memory.
 *
 * Important syntax / idea:
 * Examples: String, arrays, and user-defined classes.
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
class Concept10_ReferenceDataTypes {
    static class Customer {
        String name;
        Customer(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Omkar");
        System.out.println(customer.name);
    }
}
