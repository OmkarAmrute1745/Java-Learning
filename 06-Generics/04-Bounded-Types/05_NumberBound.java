/**
 * Topic: NumberBound
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
static <T extends Number> double add(T first, T second) {
    return first.doubleValue() + second.doubleValue();
}
class Concept05_NumberBound {

    public static void main(String[] args) {
        System.out.println(add(10, 20.5));
    }
}
