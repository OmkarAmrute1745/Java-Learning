/**
 * Topic: WildcardVsTypeParameter
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T> T first(java.util.List<T> values) {
    return values.get(0);
}
class Concept04_WildcardVsTypeParameter {

    public static void main(String[] args) {
        java.util.List<String> values = java.util.Arrays.asList("Java", "SQL");
        System.out.println(first(values));
    }
}
