/*
 * JAVA FUNDAMENTALS
 * CONCEPT: How Java Works
 *
 * What is it?
 * Java source code is compiled into bytecode. The JVM loads, verifies, and executes that bytecode.
 *
 * Why do we need it?
 * This design helps the same compiled Java program run on different operating systems that have a compatible JVM.
 *
 * Simple real-world example:
 * For example, a compiled backend application can run on a Linux server even if the developer wrote it on Windows.
 *
 * Important syntax / idea:
 * Source.java -> javac -> Source.class -> JVM -> machine instructions.
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
class Concept03_HowJavaWorks {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Bytecode is executed by the JVM.");
        System.out.println("Number: " + number);
    }
}
