/*
 * JAVA 8+
 * AREA: Functional Interfaces
 * CONCEPT: BiFunctional Interfaces
 *
 * What is it?
 * Bi-functional interfaces work with two input values.
 *
 * Why do we need it?
 * They are useful when an operation depends on two arguments.
 *
 * Key points:
 * - BiFunction returns a result.
 * - BiPredicate returns boolean.
 * - BiConsumer accepts two values and returns nothing.
 *
 * Interview note:
 * Know the difference between Function and BiFunction.
 */

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Concept06_BiFunctionalInterfaces {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition =
                (first, second) -> first + second;

        BiPredicate<String, Integer> hasLength =
                (text, length) -> text.length() == length;

        System.out.println("Addition: " + addition.apply(10, 20));
        System.out.println("Length matches: " + hasLength.test("Java", 4));
    }
}