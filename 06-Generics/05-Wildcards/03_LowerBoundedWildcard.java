/**
 * Topic: LowerBoundedWildcard
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static void addNumbers(java.util.List<? super Integer> values) {
    values.add(10);
    values.add(20);
}
class Concept03_LowerBoundedWildcard {

    public static void main(String[] args) {
        java.util.List<Number> values = new java.util.ArrayList<>();
        addNumbers(values);
        System.out.println(values);
    }
}
