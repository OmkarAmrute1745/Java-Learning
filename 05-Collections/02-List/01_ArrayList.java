/**
 * Topic: ArrayList
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_ArrayList {

    public static void main(String[] args) {
        java.util.List<String> skills = new java.util.ArrayList<>();
        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("SQL");
        skills.remove("SQL");
        System.out.println(skills);
    }
}
