/*
 * JAVA 8+
 * AREA: Interface Enhancements
 * CONCEPT: Interface Practice
 *
 * What is it?
 * Practice combines default and static interface methods.
 *
 * Why do we need it?
 * It reinforces the Java 8 interface changes used by modern APIs.
 *
 * Key points:
 * - Default methods belong to instances.
 * - Static methods belong to the interface.
 *
 * Interview note:
 * Clearly distinguish default methods from static methods.
 */

interface Logger {
    default void log(String message) {
        System.out.println("LOG: " + message);
    }

    static String format(String message) {
        return "[" + message + "]";
    }
}

class Concept04_InterfacePractice implements Logger {
    public static void main(String[] args) {
        Concept04_InterfacePractice logger = new Concept04_InterfacePractice();

        logger.log(Logger.format("Application started"));
    }
}