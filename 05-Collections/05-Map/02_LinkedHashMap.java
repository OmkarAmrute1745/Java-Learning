/**
 * Topic: LinkedHashMap
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_LinkedHashMap {

    public static void main(String[] args) {
        java.util.Map<String, Integer> scores = new java.util.LinkedHashMap<>();
        scores.put("Java", 90);
        scores.put("SQL", 85);
        System.out.println(scores);
    }
}
