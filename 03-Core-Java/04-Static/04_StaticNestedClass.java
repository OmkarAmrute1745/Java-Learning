/**
 * Topic: StaticNestedClass
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Outer {
    static class Inner {
        void show() { System.out.println("Nested class"); }
    }
}

class Concept04_StaticNestedClass {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
