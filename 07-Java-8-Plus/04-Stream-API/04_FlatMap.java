/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: flatMap()
 *
 * What is it?
 * flatMap() transforms each element into a stream and flattens the resulting streams.
 *
 * Why do we need it?
 * It is useful for processing nested collections.
 *
 * Key points:
 * - map() can produce nested structures.
 * - flatMap() removes one level of nesting.
 * - It is common with List<List<T>>.
 *
 * Interview note:
 * Be able to explain map() vs flatMap() with a nested-list example.
 */

import java.util.Arrays;
import java.util.List;

class Concept04_FlatMap {
    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("Omkar", "Amit"),
                Arrays.asList("Sneha", "Raj")
        );

        names.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}