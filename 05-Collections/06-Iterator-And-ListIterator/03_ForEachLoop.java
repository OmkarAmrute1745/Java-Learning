/**
 * Topic: ForEachLoop
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_ForEachLoop {

    public static void main(String[] args) {
        java.util.List<String> skills = java.util.Arrays.asList("Java", "Spring Boot", "SQL");
        for (String skill : skills) {
            System.out.println(skill);
        }
    }
}
