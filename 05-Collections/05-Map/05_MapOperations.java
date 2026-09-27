/**
 * Topic: MapOperations
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_MapOperations {

    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Java", 5);
        map.putIfAbsent("SQL", 3);
        map.merge("Java", 1, Integer::sum);
        System.out.println(map);
    }
}
