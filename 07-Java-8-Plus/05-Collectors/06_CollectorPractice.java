/*
 * JAVA 8+
 * AREA: Collectors
 * CONCEPT: Collector Practice
 *
 * What is it?
 * Practice combines filtering and collecting into business-style results.
 *
 * Why do we need it?
 * Real backend code often transforms and groups records before returning results.
 *
 * Key points:
 * - Filter before collecting when required.
 * - Choose the collector according to the required result.
 *
 * Interview note:
 * Explain every stage of the stream pipeline.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Concept06_CollectorPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Omkar", "Amit", "Anita", "Sneha", "Raj"
        );

        Map<Integer, List<String>> result = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}