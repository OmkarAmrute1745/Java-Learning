/*
 * JAVA OOP
 * AREA: Other-OOP-Concepts
 * CONCEPT: Upcasting and Downcasting
 *
 * What is it?
 * Upcasting and Downcasting is an important Object-Oriented Programming concept in Java.
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
        System.out.println("Eat");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}
class Concept05_UpcastingDowncasting {
    public static void main(String[]args) {
        Animal a=new Dog();
        a.eat();
        if(a instanceof Dog) {
            Dog d=(Dog)a;
            d.bark();
        }
    }
}
