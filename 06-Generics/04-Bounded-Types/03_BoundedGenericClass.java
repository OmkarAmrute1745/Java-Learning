/**
 * Topic: BoundedGenericClass
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class NumberBox<T extends Number> {
    private T value;
    NumberBox(T value) { this.value = value; }
    double doubleValue() { return value.doubleValue(); }
}
class Concept03_BoundedGenericClass {

    public static void main(String[] args) {
        NumberBox<Integer> box = new NumberBox<>(50);
        System.out.println(box.doubleValue());
    }
}
