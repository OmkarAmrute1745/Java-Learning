/**
 * Topic: 07 DateTimeApplication
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 07DateTimeApplication {

    public static void main(String[] args) {
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println(today.plusDays(30));
    }
}
