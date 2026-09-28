/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: orElse() and orElseGet()
 *
 * What is it?
 * These methods provide fallback values when an Optional is empty.
 *
 * Why do we need it?
 * They make default-value handling concise.
 *
 * Key points:
 * - orElse() receives a direct fallback value.
 * - orElseGet() receives a Supplier.
 * - orElseGet() is useful when fallback creation is expensive.
 *
 * Interview note:
 * Know the evaluation difference between orElse() and orElseGet().
 */

import java.util.Optional;

class Concept04_OrElseAndOrElseGet {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();

        System.out.println(name.orElse("Unknown"));
        System.out.println(name.orElseGet(() -> "Generated Default"));
    }
}