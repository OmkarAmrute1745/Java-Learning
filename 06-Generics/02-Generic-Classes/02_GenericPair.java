/**
 * Topic: GenericPair
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) { this.key = key; this.value = value; }
}
class Concept02_GenericPair {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(101, "Omkar");
        System.out.println(pair.key + " -> " + pair.value);
    }
}
