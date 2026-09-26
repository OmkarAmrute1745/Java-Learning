/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Command Line Arguments
 *
 * What is it?
 * Command-line arguments are values supplied when a Java program starts.
 *
 * Why do we need it?
 * They are received through the String[] args parameter of main.
 *
 * Simple real-world example:
 * They are useful for small utilities, scripts, and configurable startup values.
 *
 * Important syntax / idea:
 * Example: `java App Omkar 25` gives args[0] = Omkar and args[1] = 25.
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
class Concept31_CommandLineArguments {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Usage: java Concept31_CommandLineArguments <name> <age>");
        }
    }
}
