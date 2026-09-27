/**
 * Topic: GenericMultipleTypes
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Result<K, V, E> {
    K key;
    V value;
    E error;
    Result(K key, V value, E error) { this.key = key; this.value = value; this.error = error; }
}
class Concept05_GenericMultipleTypes {

    public static void main(String[] args) {
        Result<Integer, String, Boolean> result = new Result<>(1, "Success", false);
        System.out.println(result.value);
    }
}
