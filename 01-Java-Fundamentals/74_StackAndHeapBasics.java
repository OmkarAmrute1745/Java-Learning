/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Stack and Heap Basics
 *
 * What is it?
 * The JVM uses different memory areas for different purposes. In simple terms, method calls and local execution data are associated with stack frames, while objects are created in the heap.
 *
 * Why do we need it?
 * The stack is organized around method calls and is automatically managed as methods enter and leave. The heap stores objects and arrays.
 *
 * Simple real-world example:
 * For learning, think of a local reference variable as living in a stack frame while the object it refers to is on the heap.
 *
 * Important syntax / idea:
 * Exact JVM memory behavior is more detailed than this simplified model, especially with JIT optimization.
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
class Concept74_StackAndHeapBasics {
    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }

    static void createUser() {
        User user = new User("Omkar");
        System.out.println(user.name);
    }

    public static void main(String[] args) {
        createUser();
        System.out.println("The method call has returned.");
    }
}
