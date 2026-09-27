/**
 * Topic: ZonedDateTime
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept05_ZonedDateTime {

    public static void main(String[] args) {
        System.out.println(java.time.ZonedDateTime.now(java.time.ZoneId.of("Asia/Kolkata")));
    }
}
