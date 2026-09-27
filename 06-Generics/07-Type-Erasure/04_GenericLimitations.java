/**
 * Topic: GenericLimitations
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_GenericLimitations {

    public static void main(String[] args) {
        System.out.println("Generics do not support primitive type arguments directly.");
        java.util.List<Integer> values = new java.util.ArrayList<>();
        values.add(10);
    }
}
