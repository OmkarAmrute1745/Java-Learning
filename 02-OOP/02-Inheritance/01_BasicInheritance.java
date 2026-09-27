/*
 * JAVA OOP
 * AREA: Inheritance
 * CONCEPT: Basic Inheritance
 *
 * What is it?
 * Basic Inheritance is an important Object-Oriented Programming concept in Java.
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

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Concept01_BasicInheritance {
    public static void main(String[]args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
