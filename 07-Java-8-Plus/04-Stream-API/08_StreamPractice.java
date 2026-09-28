/*
 * JAVA 8+
 * AREA: Stream API
 * CONCEPT: Stream Practice
 *
 * What is it?
 * Practice combines multiple stream operations into one pipeline.
 *
 * Why do we need it?
 * Real applications commonly combine filtering and transformation.
 *
 * Key points:
 * - Build pipelines step by step.
 * - Keep intermediate operations readable.
 * - Finish with a terminal operation.
 *
 * Interview note:
 * Be able to read a stream pipeline and explain each operation in order.
 */

import java.util.Arrays;
import java.util.List;

class Concept08_StreamPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Omkar", "Amit", "Sneha", "Raj", "Pranitha"
        );

        names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}