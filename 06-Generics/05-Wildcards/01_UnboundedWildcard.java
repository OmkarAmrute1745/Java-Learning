/**
 * Topic: UnboundedWildcard
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static void print(java.util.List<?> values) {
    for (Object value : values) {
        System.out.println(value);
    }
}
class Concept01_UnboundedWildcard {

    public static void main(String[] args) {
        java.util.List<String> values = java.util.Arrays.asList("Java", "SQL");
        print(values);
    }
}
