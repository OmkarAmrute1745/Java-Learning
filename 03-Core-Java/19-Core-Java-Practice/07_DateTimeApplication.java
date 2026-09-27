/**
 * Topic: DateTimeApplication
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept07_DateTimeApplication {

    public static void main(String[] args) {
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println(today.plusDays(30));
    }
}
