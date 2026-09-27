/**
 * Topic: GenericPairUtility
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) { this.key = key; this.value = value; }
    public String toString() { return key + " = " + value; }
}
class Concept03_GenericPairUtility {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Java", 21);
        System.out.println(pair);
    }
}
