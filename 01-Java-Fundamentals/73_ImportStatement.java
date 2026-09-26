/*
 * JAVA FUNDAMENTALS
 * CONCEPT: import Statement
 *
 * What is it?
 * The import statement lets code use classes from another package without writing the fully qualified class name every time.
 *
 * Why do we need it?
 * It improves readability and is common throughout Java applications.
 *
 * Simple real-world example:
 * Classes from java.lang, such as String, are automatically available without an import.
 *
 * Important syntax / idea:
 * You can import one class or use a wildcard such as java.util.*.
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
import java.util.ArrayList;
import java.util.List;

class Concept73_ImportStatement {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Omkar");
        names.add("Java");

        System.out.println(names);
    }
}
