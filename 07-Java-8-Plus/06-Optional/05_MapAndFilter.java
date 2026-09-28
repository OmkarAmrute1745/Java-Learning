/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: map() and filter()
 *
 * What is it?
 * Optional supports transformations and conditional filtering.
 *
 * Why do we need it?
 * It allows simple null-safe processing pipelines.
 *
 * Key points:
 * - map() transforms the contained value.
 * - filter() keeps the value only when the condition is true.
 *
 * Interview note:
 * Optional map() is similar in idea to Stream map(), but it processes at most one value.
 */

import java.util.Optional;

class Concept05_MapAndFilter {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Omkar");

        Optional<Integer> length = name
                .filter(value -> value.length() > 3)
                .map(String::length);

        System.out.println(length.orElse(0));
    }
}