/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Java 8
 * CONCEPT: Optional
 *
 * What is it?
 * Optional models a value that may be present or absent.
 *
 * Why do we need it?
 * It can make absence explicit in return types and reduce accidental null dereferences.
 *
 * Key points:
 * - Avoid calling get without checking; use map, orElseGet, or orElseThrow as appropriate.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Optional is generally most useful as a return type, not as a field or method parameter by default.
 */

import java.util.Optional;
class Concept02_OptionalUsage {
    static Optional<String> findName(int id) {
        return id == 1 ? Optional.of("Omkar") : Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(findName(1).orElse("Unknown"));
        System.out.println(findName(2).orElse("Unknown"));
    }
}
