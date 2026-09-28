/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: Function
 *
 * What is it?
 * Function<T, R> accepts a value of type T and returns a value of type R.
 *
 * Why do we need it?
 * It is useful when one value must be transformed into another.
 *
 * Key points:
 * - Main method: apply(T).
 * - Input and output types can differ.
 * - Function is common with Stream.map().
 *
 * Interview note:
 * Remember: Function takes input and produces output.
 */

import java.util.function.Function;

class Concept04_Function {
    public static void main(String[] args) {
        Function<String, Integer> length = value -> value.length();

        System.out.println(length.apply("Java"));
        System.out.println(length.apply("Spring Boot"));
    }
}