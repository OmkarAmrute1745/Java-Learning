/**
 * Topic: DateTimeFormatter
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept07_DateTimeFormatter {

    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.now();
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
    }
}
