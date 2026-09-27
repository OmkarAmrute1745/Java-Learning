/**
 * Topic: 02 StaticNestedClass
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Outer {
    static class Inner {
        void show() {
            System.out.println("Static nested class");
        }
    }
}

public class 02StaticNestedClass {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
