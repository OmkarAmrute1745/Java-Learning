/**
 * Topic: StringImmutability
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_StringImmutability {

    public static void main(String[] args) {
        String value = "Java";
        value.concat(" Backend");
        System.out.println(value);
        value = value.concat(" Backend");
        System.out.println(value);
    }
}
