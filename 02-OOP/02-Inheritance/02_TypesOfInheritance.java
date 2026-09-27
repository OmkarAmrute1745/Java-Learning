/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: Types of Inheritance
 *
 * What is it?
 * Types of Inheritance is an important Object-Oriented Programming concept in Java.
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
    void start() {
        System.out.println("Start");
    }
}
class Car extends Vehicle {
}
class SportsCar extends Car {
    void turbo() {
        System.out.println("Turbo");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike");
    }
}
class Concept02_TypesOfInheritance {
    public static void main(String[]args) {
        new SportsCar().turbo();
        new Bike().ride();
    }
}
