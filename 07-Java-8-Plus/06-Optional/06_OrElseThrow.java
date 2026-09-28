/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: orElseThrow()
 *
 * What is it?
 * orElseThrow() returns the value when present and throws an exception when absent.
 *
 * Why do we need it?
 * It is useful when absence represents an error condition.
 *
 * Key points:
 * - The exception supplier is evaluated when needed.
 * - It makes failure behavior explicit.
 *
 * Interview note:
 * Use it when a missing value should not silently continue.
 */

import java.util.Optional;

class Concept06_OrElseThrow {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Omkar");

        String value = name.orElseThrow(
                () -> new IllegalArgumentException("Name is missing")
        );

        System.out.println(value);
    }
}