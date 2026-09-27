/**
 * Topic: RawTypeWarning
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_RawTypeWarning {

    public static void main(String[] args) {
        java.util.List<String> names = new java.util.ArrayList<>();
        java.util.List raw = names;
        raw.add(100);
        try {
            String value = names.get(0);
            System.out.println(value);
        } catch (ClassCastException exception) {
            System.out.println("Raw types can break type safety.");
        }
    }
}
