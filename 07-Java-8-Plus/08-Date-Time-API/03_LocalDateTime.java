/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: LocalDateTime
 *
 * What is it?
 * LocalDateTime combines a date and time without a timezone.
 *
 * Why do we need it?
 * It is useful for local business timestamps where timezone information is not required.
 *
 * Key points:
 * - Combines LocalDate and LocalTime.
 * - It does not contain timezone information.
 *
 * Interview note:
 * Do not use LocalDateTime when the exact timezone/instant matters.
 */

import java.time.LocalDateTime;

class Concept03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime meeting = LocalDateTime.of(2026, 9, 28, 11, 30);

        System.out.println("Meeting: " + meeting);
        System.out.println("Tomorrow: " + meeting.plusDays(1));
    }
}