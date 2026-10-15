/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Core Java
 * CONCEPT: String immutability
 *
 * What is it?
 * A String object cannot be changed after it is created.
 *
 * Why do we need it?
 * Immutability supports safe sharing, stable hash codes, and string-pool reuse.
 *
 * Key points:
 * - Operations such as replace create a new String rather than modifying the original.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain String immutability and why StringBuilder is better for repeated changes.
 */

class Concept01_StringImmutability {
    public static void main(String[] args) {
        String value = "Java";
        value.concat(" Developer");
        System.out.println(value); // Java: result was not assigned
        value = value.concat(" Developer");
        System.out.println(value);
    }
}
