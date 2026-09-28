/*
 * JAVA 8+
 * AREA: Modern Functional Patterns
 * CONCEPT: Stream and Optional
 *
 * What is it?
 * Stream and Optional can be combined when a pipeline may produce no matching value.
 *
 * Why do we need it?
 * It is useful for finding and transforming data without manual null checks.
 *
 * Key points:
 * - findFirst() commonly returns Optional.
 * - Optional can continue the transformation after the stream ends.
 *
 * Interview note:
 * Understand the boundary between Stream processing and Optional result handling.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Concept03_StreamAndOptional {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Omkar", "Sneha");

        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("O"))
                .findFirst();

        System.out.println(result.orElse("Not Found"));
    }
}