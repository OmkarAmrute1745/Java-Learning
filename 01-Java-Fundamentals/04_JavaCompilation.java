/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Java Compilation
 *
 * What is it?
 * The Java compiler, usually `javac`, converts `.java` source code into `.class` bytecode.
 *
 * Why do we need it?
 * Compilation catches many syntax and type errors before the program runs.
 *
 * Simple real-world example:
 * For example, if a variable is declared as int, assigning a String to it causes a compile-time error.
 *
 * Important syntax / idea:
 * Command: javac Demo.java. Run: java Demo.
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
class Concept04_JavaCompilation {
    public static void main(String[] args) {
        int age = 25; // This type is checked during compilation.
        System.out.println("Age: " + age);
    }
}
