/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: Predicate
 *
 * What is it?
 * Predicate<T> represents a condition and returns boolean.
 *
 * Why do we need it?
 * It is useful for filtering and validation rules.
 *
 * Key points:
 * - Main method: test(T).
 * - Result is boolean.
 * - Predicates can be combined with and(), or(), and negate().
 *
 * Interview note:
 * Predicate is heavily used with Stream.filter().
 */

import java.util.function.Predicate;

class Concept02_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));
    }
}