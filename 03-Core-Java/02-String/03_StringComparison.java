/**
 * Topic: StringComparison
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_StringComparison {

    public static void main(String[] args) {
        String first = new String("Java");
        String second = new String("Java");
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
