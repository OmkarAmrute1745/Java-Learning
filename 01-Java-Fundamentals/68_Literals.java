/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Literals
 *
 * What is it?
 * A literal is a fixed value written directly in source code.
 *
 * Why do we need it?
 * Examples include integer, floating-point, character, String, boolean, and null literals.
 *
 * Simple real-world example:
 * Literals are different from variables because the literal itself represents the value.
 *
 * Important syntax / idea:
 * Suffixes such as L and F can tell Java the intended numeric type.
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
class Concept68_Literals {
    public static void main(String[] args) {
        int count = 10;          // integer literal
        long big = 10_000L;      // long literal
        double price = 99.50;    // double literal
        float rate = 2.5F;       // float literal
        char grade = 'A';        // character literal
        String name = "Omkar";   // String literal
        boolean active = true;   // boolean literal

        System.out.println(count + " " + big + " " + price);
        System.out.println(rate + " " + grade + " " + name + " " + active);
    }
}
