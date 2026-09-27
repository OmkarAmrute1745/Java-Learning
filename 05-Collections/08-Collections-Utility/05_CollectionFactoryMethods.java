/**
 * Topic: CollectionFactoryMethods
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_CollectionFactoryMethods {

    public static void main(String[] args) {
        java.util.List<String> list = java.util.List.of("Java", "SQL");
        java.util.Set<Integer> set = java.util.Set.of(10, 20);
        java.util.Map<Integer, String> map = java.util.Map.of(1, "Java", 2, "SQL");
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
