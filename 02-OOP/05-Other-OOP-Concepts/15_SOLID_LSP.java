/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: SOLID - Liskov Substitution
 *
 * What is it?
 * SOLID - Liskov Substitution is an important Object-Oriented Programming concept in Java.
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

interface Flyable {
    void fly();
}
class Eagle implements Flyable {
    public void fly() {
        System.out.println("Eagle flies");
    }
}
class Concept15_SOLID_LSP {
    public static void main(String[]args) {
        Flyable f=new Eagle();
        f.fly();
    }
}
