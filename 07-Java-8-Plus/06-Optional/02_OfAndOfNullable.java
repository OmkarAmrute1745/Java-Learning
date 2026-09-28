/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: of() and ofNullable()
 *
 * What is it?
 * of() creates an Optional from a known non-null value; ofNullable() handles a possibly null value.
 *
 * Why do we need it?
 * It makes the possibility of absence explicit.
 *
 * Key points:
 * - Optional.of(null) throws NullPointerException.
 * - Optional.ofNullable(null) creates Optional.empty().
 *
 * Interview note:
 * Know when to use of() and when to use ofNullable().
 */

import java.util.Optional;

class Concept02_OfAndOfNullable {
    public static void main(String[] args) {
        Optional<String> first = Optional.of("Java");
        Optional<String> second = Optional.ofNullable(null);

        System.out.println(first);
        System.out.println(second);
    }
}