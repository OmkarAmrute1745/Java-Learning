/*
 * JAVA 8+
 * AREA: Interface Enhancements
 * CONCEPT: Static Method in Interface
 *
 * What is it?
 * Java 8 allows interfaces to define static methods.
 *
 * Why do we need it?
 * Related utility behavior can stay with the interface.
 *
 * Key points:
 * - Static interface methods are called using the interface name.
 * - They are not inherited as instance methods.
 *
 * Interview note:
 * Explain why an implementing object cannot call an interface static method as an instance method.
 */

interface MathUtility {
    static int square(int number) {
        return number * number;
    }
}

class Concept02_StaticMethod {
    public static void main(String[] args) {
        System.out.println(MathUtility.square(5));
    }
}