/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Grouping Practice
 *
 * What is it?
 * This practice groups names by their length.
 *
 * Why do we need it?
 * Grouping is a common reporting requirement.
 *
 * Key points:
 * - groupingBy() creates groups based on a classifier.
 * - The result can be a Map of groups.
 *
 * Interview note:
 * Explain what the key and value represent in the resulting Map.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Concept04_GroupingPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Omkar", "Amit", "Raj", "Sneha", "Anita"
        );

        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}