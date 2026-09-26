/*
 * JAVA FUNDAMENTALS
 * CONCEPT: Primitive Data Types
 *
 * What is it?
 * Java has eight primitive types: byte, short, int, long, float, double, char, and boolean.
 *
 * Why do we need it?
 * Primitives directly represent simple values and are efficient for basic data.
 *
 * Simple real-world example:
 * Use them for values such as counts, flags, characters, and numeric calculations.
 *
 * Important syntax / idea:
 * Eight primitives: byte, short, int, long, float, double, char, boolean.
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
class Concept09_PrimitiveDataTypes {
    public static void main(String[] args) {
        byte small = 10;
        short year = 2026;
        int age = 25;
        long population = 8000000000L;
        float rate = 2.5F;
        double salary = 50000.75;
        char grade = 'A';
        boolean active = true;

        System.out.println(small + " " + year + " " + age);
        System.out.println(population + " " + rate + " " + salary);
        System.out.println(grade + " " + active);
    }
}
