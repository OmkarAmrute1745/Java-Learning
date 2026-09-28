/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: filter()
 *
 * What is it?
 * filter() keeps stream elements that satisfy a condition.
 *
 * Why do we need it?
 * It is useful for selecting records based on business conditions.
 *
 * Key points:
 * - filter() is an intermediate operation.
 * - It uses a Predicate.
 * - It can be chained with other operations.
 *
 * Interview note:
 * Explain why filter() does not produce the final result by itself.
 */

import java.util.Arrays;
import java.util.List;

class Concept02_Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
                .filter(number -> number > 20)
                .forEach(System.out::println);
    }
}