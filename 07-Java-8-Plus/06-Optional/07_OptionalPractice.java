/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: Optional Practice
 *
 * What is it?
 * Practice combines Optional operations to process a possibly absent value.
 *
 * Why do we need it?
 * Backend services frequently handle optional lookup results.
 *
 * Key points:
 * - Keep the pipeline readable.
 * - Provide an appropriate fallback or exception.
 *
 * Interview note:
 * Be able to explain each Optional operation in sequence.
 */

import java.util.Optional;

class Concept07_OptionalPractice {
    public static void main(String[] args) {
        Optional<String> username = Optional.ofNullable("omkar");

        String result = username
                .filter(value -> !value.isEmpty())
                .map(String::toUpperCase)
                .orElse("UNKNOWN");

        System.out.println(result);
    }
}