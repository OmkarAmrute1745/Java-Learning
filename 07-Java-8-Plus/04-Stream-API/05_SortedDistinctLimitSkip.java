/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: sorted(), distinct(), limit(), skip()
 *
 * What is it?
 * These operations control ordering, duplicates, and the number of processed elements.
 *
 * Why do we need it?
 * They are useful when preparing data for display, pagination, or unique results.
 *
 * Key points:
 * - sorted() orders elements.
 * - distinct() removes duplicates.
 * - limit() keeps a maximum number.
 * - skip() ignores the first elements.
 *
 * Interview note:
 * These are intermediate stream operations.
 */

import java.util.Arrays;
import java.util.List;

class Concept05_SortedDistinctLimitSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(30, 10, 20, 20, 40, 50);

        numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);
    }
}