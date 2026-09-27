/**
 * Topic: ForEachMethod
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_ForEachMethod {

    public static void main(String[] args) {
        java.util.List<String> skills = java.util.Arrays.asList("Java", "Spring Boot", "SQL");
        skills.forEach(System.out::println);
    }
}
