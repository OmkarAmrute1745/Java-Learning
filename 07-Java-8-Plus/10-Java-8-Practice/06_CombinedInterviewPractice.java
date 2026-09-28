/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Combined Interview Practice
 *
 * What is it?
 * This example combines filtering, mapping, sorting, and collecting.
 *
 * Why do we need it?
 * Interview questions often combine multiple Java 8 features in one requirement.
 *
 * Key points:
 * - Read the requirement first.
 * - Break the solution into stream stages.
 * - Explain each stage clearly.
 *
 * Interview note:
 * Do not memorize the pipeline. Understand why each operation is present.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Concept06_CombinedInterviewPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Omkar", "Amit", "Sneha", "Raj", "Pranitha"
        );

        List<String> result = names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}