/**
 * Topic: FunctionalInterface
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
@FunctionalInterface
interface Greeting {

    void greet(String name);
}

class Concept01_FunctionalInterface {

    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello, " + name);

        greeting.greet("Omkar");
    }
}