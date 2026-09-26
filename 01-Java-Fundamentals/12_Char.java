/*
 * JAVA FUNDAMENTALS
 * CONCEPT: char
 *
 * What is it?
 * char stores one UTF-16 character and uses single quotes.
 *
 * Why do we need it?
 * It is useful when processing individual characters such as grades, symbols, or letters.
 *
 * Simple real-world example:
 * A validation rule might check whether a character is a digit or a letter.
 *
 * Important syntax / idea:
 * Example: char grade = 'A';
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
class Concept12_Char {
    public static void main(String[] args) {
        char grade = 'A';
        char firstLetter = 'O';

        System.out.println("Grade: " + grade);
        System.out.println("First letter: " + firstLetter);
    }
}
