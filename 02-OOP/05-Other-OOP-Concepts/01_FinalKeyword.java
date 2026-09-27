/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: final Keyword
 *
 * What is it?
 * final Keyword is an important Object-Oriented Programming concept in Java.
 *
 * Why do we need it?
 * It helps us understand how Java models objects, relationships, reusable behavior, and maintainable designs.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the values.
 * - Connect the example to a real-world object or relationship.
 *
 * Interview note:
 * Be able to explain this concept in simple words and give one practical example.
 */

final class Utility {
    static final double TAX=.18;
    final void show() {
        System.out.println("Fixed");
    }
}
class Concept01_FinalKeyword {
    public static void main(String[]args) {
        System.out.println(Utility.TAX);
        new Utility().show();
    }
}
