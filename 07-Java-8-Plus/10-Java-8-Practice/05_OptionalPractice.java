/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Optional Practice
 *
 * What is it?
 * This practice handles a possibly missing username.
 *
 * Why do we need it?
 * Backend lookups may return no result.
 *
 * Key points:
 * - Use Optional to make absence explicit.
 * - Transform and provide a fallback.
 *
 * Interview note:
 * Explain why orElse() is used at the end of the pipeline.
 */

import java.util.Optional;

class Concept05_OptionalPractice {
    public static void main(String[] args) {
        Optional<String> username = Optional.ofNullable(null);

        String result = username
                .map(String::toUpperCase)
                .orElse("GUEST");

        System.out.println("User: " + result);
    }
}