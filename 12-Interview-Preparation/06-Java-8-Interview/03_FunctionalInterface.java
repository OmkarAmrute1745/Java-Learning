/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Java 8
 * CONCEPT: Functional interface
 *
 * What is it?
 * A functional interface has exactly one abstract method and can be represented by a lambda expression.
 *
 * Why do we need it?
 * It allows behavior to be passed as a value.
 *
 * Key points:
 * - Default and static methods do not count as abstract methods.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Know Predicate, Function, Consumer, and Supplier and their input/output shapes.
 */

import java.util.function.Predicate;
class Concept03_FunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> nonBlank = text -> text != null && !text.isBlank();
        System.out.println(nonBlank.test("Java"));
        System.out.println(nonBlank.test(" "));
    }
}
