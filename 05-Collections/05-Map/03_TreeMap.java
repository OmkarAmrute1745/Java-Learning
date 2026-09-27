/**
 * Topic: TreeMap
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_TreeMap {

    public static void main(String[] args) {
        java.util.Map<Integer, String> values = new java.util.TreeMap<>();
        values.put(30, "C");
        values.put(10, "A");
        values.put(20, "B");
        System.out.println(values);
    }
}
