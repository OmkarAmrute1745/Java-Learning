/**
 * Topic: Map
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_Map {

    public static void main(String[] args) {
        java.util.List<String> names = java.util.Arrays.asList("java", "spring");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
