/**
 * Topic: 02 FinalMethod
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Parent {
    final void show() {
        System.out.println("Parent final method");
    }
}

class Child extends Parent {
}

public class 02FinalMethod {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.show();
    }
}
