/**
 * Topic: ObjectsUtility
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_ObjectsUtility {

    public static void main(String[] args) {
        String value = null;
        System.out.println(java.util.Objects.requireNonNullElse(value, "Unknown"));
    }
}
