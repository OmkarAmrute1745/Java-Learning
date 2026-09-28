/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: ifPresent()
 *
 * What is it?
 * ifPresent() executes an action only when a value exists.
 *
 * Why do we need it?
 * It avoids directly calling get() when a value may be absent.
 *
 * Key points:
 * - It accepts a Consumer.
 * - Empty Optional does nothing.
 *
 * Interview note:
 * Explain why ifPresent() is safer than blindly calling get().
 */

import java.util.Optional;

class Concept03_IfPresent {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Omkar");

        name.ifPresent(value -> System.out.println("Name: " + value));
    }
}