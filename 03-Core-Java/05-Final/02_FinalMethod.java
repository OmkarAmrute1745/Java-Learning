/**
 * Topic: FinalMethod
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Parent {
    final void show() { System.out.println("Final method"); }
}
class Child extends Parent {}

class Concept02_FinalMethod {

    public static void main(String[] args) {
        new Child().show();
    }
}
