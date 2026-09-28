/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: Period and Duration
 *
 * What is it?
 * Period measures date-based amounts, while Duration measures time-based amounts.
 *
 * Why do we need it?
 * They make date and time differences explicit and readable.
 *
 * Key points:
 * - Period is suitable for years, months, and days.
 * - Duration is suitable for hours, minutes, seconds, and nanos.
 *
 * Interview note:
 * Know why Period and Duration represent different concepts.
 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

class Concept06_PeriodAndDuration {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2026, 1, 1);
        LocalDate end = LocalDate.of(2026, 9, 28);

        Period period = Period.between(start, end);
        Duration duration = Duration.ofHours(5);

        System.out.println("Period: " + period);
        System.out.println("Duration: " + duration);
    }
}