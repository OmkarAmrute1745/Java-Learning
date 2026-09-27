/**
 * Topic: CollectionInterviewPractice
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept06_CollectionInterviewPractice {

    public static void main(String[] args) {
        java.util.Map<String, Integer> frequency = new java.util.HashMap<>();
        String[] words = {"java", "sql", "java", "spring"};
        for (String word : words) {
            frequency.merge(word, 1, Integer::sum);
        }
        System.out.println("Frequency: " + frequency);
    }
}
