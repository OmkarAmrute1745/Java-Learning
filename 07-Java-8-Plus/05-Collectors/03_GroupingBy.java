/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: groupingBy()
 *
 * What is it?
 * groupingBy() groups stream elements according to a classification function.
 *
 * Why do we need it?
 * It is useful for reporting and grouping records by a business field.
 *
 * Key points:
 * - It commonly returns Map<K, List<T>>.
 * - The classifier decides the group.
 * - It can be combined with downstream collectors.
 *
 * Interview note:
 * groupingBy() is a common Stream API interview question.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Concept03_GroupingBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Omkar", "Amit", "Anita", "Raj"
        );

        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}