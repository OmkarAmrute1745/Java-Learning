/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Scanner Input
 *
 * What is it?
 * Scanner is a convenient class for reading input from the console.
 *
 * Why do we need it?
 * It is commonly used in beginner programs and small command-line utilities.
 *
 * Simple real-world example:
 * Scanner can read int, double, String, and other common input types.
 *
 * Important syntax / idea:
 * Remember that nextInt() followed by nextLine() can require care because of the remaining newline.
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
import java.util.Scanner;

class Concept28_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You entered: " + age);

        scanner.close();
    }
}
