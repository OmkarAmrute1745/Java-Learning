/*
 * JAVA 8+
 * AREA: Modern Functional Patterns
 * CONCEPT: Predicate Composition
 *
 * What is it?
 * Predicates can be combined to build larger conditions.
 *
 * Why do we need it?
 * It keeps validation rules reusable and composable.
 *
 * Key points:
 * - and() requires both conditions.
 * - or() requires at least one condition.
 * - negate() reverses the result.
 *
 * Interview note:
 * Predicate composition is useful for reusable validation rules.
 */

import java.util.function.Predicate;

class Concept02_PredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> positive = number -> number > 0;
        Predicate<Integer> even = number -> number % 2 == 0;

        Predicate<Integer> positiveEven = positive.and(even);

        System.out.println(positiveEven.test(10));
        System.out.println(positiveEven.test(-10));
    }
}