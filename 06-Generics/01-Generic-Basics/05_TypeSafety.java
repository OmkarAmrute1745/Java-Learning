/**
 * Topic: TypeSafety
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_TypeSafety {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<>();
        names.add("Omkar");
        System.out.println(names.get(0).toUpperCase());
    }
}
