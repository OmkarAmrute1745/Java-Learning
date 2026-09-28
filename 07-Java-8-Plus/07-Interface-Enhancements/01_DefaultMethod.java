/*
 * JAVA 8+
 * AREA: Interface Enhancements
 * CONCEPT: Default Method
 *
 * What is it?
 * Java 8 allows interfaces to contain default methods with implementations.
 *
 * Why do we need it?
 * Default methods allow interfaces to evolve without forcing every existing implementation to immediately implement a new method.
 *
 * Key points:
 * - Use the default keyword.
 * - Implementing classes can inherit or override the method.
 *
 * Interview note:
 * Know how Java resolves a default method when a class overrides it.
 */

interface Vehicle {
    default void start() {
        System.out.println("Vehicle starts");
    }
}

class Concept01_DefaultMethod {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
        };

        vehicle.start();
    }
}