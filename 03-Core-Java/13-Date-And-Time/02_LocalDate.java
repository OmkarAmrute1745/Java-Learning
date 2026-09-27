/**
 * Topic: 02 LocalDate
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 02LocalDate {

    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println(date);
        System.out.println(date.plusDays(5));
    }
}
