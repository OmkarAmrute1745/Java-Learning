/*
 * JAVA FUNDAMENTALS
 * CONCEPT: BufferedReader Input
 *
 * What is it?
 * BufferedReader reads text efficiently from a character stream.
 *
 * Why do we need it?
 * It is useful when reading larger amounts of text or when you want line-based input.
 *
 * Simple real-world example:
 * Input from System.in is wrapped with InputStreamReader and then BufferedReader.
 *
 * Important syntax / idea:
 * readLine() returns a String, so numeric conversion is usually required.
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Concept29_BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Hello, " + name);
    }
}
