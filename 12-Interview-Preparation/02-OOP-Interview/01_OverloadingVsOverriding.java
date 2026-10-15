/*
 * JAVA INTERVIEW PREPARATION
 * AREA: OOP
 * CONCEPT: Overloading versus overriding
 *
 * What is it?
 * Overloading uses the same method name with different parameter lists; overriding replaces inherited behavior with a subtype implementation.
 *
 * Why do we need it?
 * Both support flexible APIs and runtime polymorphism in different ways.
 *
 * Key points:
 * - Overloading is resolved at compile time; overriding uses runtime dispatch for instance methods.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Compare method signature, inheritance requirement, and binding time.
 */

class Printer {
    void print(int value) { System.out.println("int: " + value); }
    void print(String value) { System.out.println("String: " + value); }
}
class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { @Override void sound() { System.out.println("Bark"); } }
class Concept01_OverloadingVsOverriding {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10); p.print("Java");
        Animal a = new Dog();
        a.sound();
    }
}
