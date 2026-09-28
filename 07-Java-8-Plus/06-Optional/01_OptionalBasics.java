/*
 * JAVA 8+
 * AREA: Optional
 * CONCEPT: Optional Basics
 *
 * What is it?
 * Optional is a container that may contain a non-null value or be empty.
 *
 * Why do we need it?
 * It provides an explicit way to represent an absent result and can reduce direct null checks.
 *
 * Key points:
 * - Optional can be empty.
 * - of() requires a non-null value.
 * - ofNullable() accepts a nullable value.
 *
 * Interview note:
 * Optional is mainly useful for return values and should not be treated as a replacement for every null.
 */

import java.util.Optional;

class Concept01_OptionalBasics {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Omkar");
        Optional<String> empty = Optional.empty();

        System.out.println(name);
        System.out.println(empty);
    }
}