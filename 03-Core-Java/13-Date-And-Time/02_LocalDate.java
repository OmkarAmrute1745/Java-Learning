/**
 * Topic: LocalDate
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept02_LocalDate {

    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println(date.plusDays(5));
    }
}
