/*
 * JAVA 8+
 * AREA: Modern Functional Patterns
 * CONCEPT: Real-World Functional Pipeline
 *
 * What is it?
 * A functional pipeline combines filtering, mapping, sorting, and collecting.
 *
 * Why do we need it?
 * Backend services frequently transform collections of entities into response data.
 *
 * Key points:
 * - Keep each pipeline stage focused.
 * - Use meaningful intermediate logic.
 *
 * Interview note:
 * Be able to explain the pipeline from source to final result.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Concept04_RealWorldPipeline {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Omkar", "Amit", "Sneha", "Raj", "Pranitha"
        );

        List<String> result = employees.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}