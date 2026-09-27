/*
 * JAVA OOP
 * AREA: Polymorphism
 * CONCEPT: Static vs Dynamic Binding
 *
 * What is it?
 * Static vs Dynamic Binding is an important Object-Oriented Programming concept in Java.
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

class Parent {
    void show(int x) {
        System.out.println("Parent int");
    }
    void display() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    void show(String x) {
        System.out.println("Child String");
    }
    @Override void display() {
        System.out.println("Child");
    }
}
class Concept06_StaticVsDynamicBinding {
    public static void main(String[]args) {
        Child c=new Child();
        c.show(1);
        c.show("x");
        Parent p=new Child();
        p.display();
    }
}
