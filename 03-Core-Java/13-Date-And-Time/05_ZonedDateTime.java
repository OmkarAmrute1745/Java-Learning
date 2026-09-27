/**
 * Topic: 05 ZonedDateTime
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 05ZonedDateTime {

    public static void main(String[] args) {
        System.out.println(java.time.ZonedDateTime.now(java.time.ZoneId.of("Asia/Kolkata")));
    }
}
