/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: IS-A Relationship
 *
 * What is it?
 * IS-A Relationship is an important Object-Oriented Programming concept in Java.
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

class Vehicle {
    void move() {
        System.out.println("Move");
    }
}
class Car extends Vehicle {
}
class Concept06_ISARelationship {
    public static void main(String[]args) {
        Car c=new Car();
        System.out.println(c instanceof Vehicle);
        c.move();
    }
}
