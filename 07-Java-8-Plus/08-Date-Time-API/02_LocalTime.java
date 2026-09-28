/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: LocalTime
 *
 * What is it?
 * LocalTime represents a time without a date or timezone.
 *
 * Why do we need it?
 * It is useful for time-of-day business rules.
 *
 * Key points:
 * - LocalTime is immutable.
 * - It represents hours, minutes, seconds, and fractions.
 *
 * Interview note:
 * Choose LocalTime when the date and timezone are not part of the business value.
 */

import java.time.LocalTime;

class Concept02_LocalTime {
    public static void main(String[] args) {
        LocalTime current = LocalTime.now();
        LocalTime opening = LocalTime.of(9, 30);

        System.out.println("Current: " + current);
        System.out.println("Opening: " + opening);
    }
}