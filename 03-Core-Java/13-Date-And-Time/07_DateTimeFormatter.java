/**
 * Topic: 07 DateTimeFormatter
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 07DateTimeFormatter {

    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.now();
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
    }
}
