/**
 * Topic: HashMapVsLinkedHashMapVsTreeMap
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept06_HashMapVsLinkedHashMapVsTreeMap {

    public static void main(String[] args) {
        java.util.Map<Integer, String> hash = new java.util.HashMap<>();
        java.util.Map<Integer, String> linked = new java.util.LinkedHashMap<>();
        java.util.Map<Integer, String> tree = new java.util.TreeMap<>();
        for (int key : new int[]{3, 1, 2}) {
            hash.put(key, "value");
            linked.put(key, "value");
            tree.put(key, "value");
        }
        System.out.println(hash);
        System.out.println(linked);
        System.out.println(tree);
    }
}
