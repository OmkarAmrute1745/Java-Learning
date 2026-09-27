/**
 * Topic: WordFrequency
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_WordFrequency {

    public static void main(String[] args) {
        String sentence = "java spring java sql";
        java.util.Map<String, Integer> frequency = new java.util.HashMap<>();
        for (String word : sentence.split(" ")) {
            frequency.merge(word, 1, Integer::sum);
        }
        System.out.println(frequency);
    }
}
