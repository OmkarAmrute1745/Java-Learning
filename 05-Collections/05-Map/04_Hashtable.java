/**
 * Topic: Hashtable
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_Hashtable {

    public static void main(String[] args) {
        java.util.Hashtable<Integer, String> values = new java.util.Hashtable<>();
        values.put(1, "Java");
        values.put(2, "Spring");
        System.out.println(values);
    }
}
