/*
 * JAVA 8+
 * AREA: Method References
 * CONCEPT: Static Method Reference
 *
 * What is it?
 * A static method reference refers to an existing static method using ClassName::methodName.
 *
 * Why do we need it?
 * It makes a lambda shorter when an existing method already matches the required behavior.
 *
 * Key points:
 * - Syntax: ClassName::staticMethod.
 * - The referenced method must match the functional interface signature.
 *
 * Interview note:
 * Method references are shorthand for suitable lambda expressions.
 */

import java.util.function.Function;

class Concept01_StaticMethodReference {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> operation =
                Concept01_StaticMethodReference::square;

        System.out.println(operation.apply(5));
    }
}