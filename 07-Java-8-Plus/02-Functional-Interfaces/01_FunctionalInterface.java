/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: Functional Interface
 *
 * What is it?
 * A functional interface contains exactly one abstract method.
 *
 * Why do we need it?
 * It provides the target type for lambda expressions and method references.
 *
 * Key points:
 * - @FunctionalInterface documents the intention.
 * - It can have default and static methods.
 * - Runnable is a standard functional interface.
 *
 * Interview note:
 * Know why a lambda cannot directly exist without a target functional interface.
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