/**
 * Topic: GenericCache
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Cache<K, V> {
    private final java.util.Map<K, V> values = new java.util.HashMap<>();
    void put(K key, V value) { values.put(key, value); }
    V get(K key) { return values.get(key); }
}
class Concept02_GenericCache {

    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>();
        cache.put(1, "Java");
        System.out.println(cache.get(1));
    }
}
