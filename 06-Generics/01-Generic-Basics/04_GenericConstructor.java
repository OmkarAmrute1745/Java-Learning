/**
 * Topic: GenericConstructor
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Product {
    private String name;
    <T> Product(T value) { this.name = String.valueOf(value); }
    public String toString() { return name; }
}
class Concept04_GenericConstructor {

    public static void main(String[] args) {
        System.out.println(new Product(101));
    }
}
