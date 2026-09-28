/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: LocalDate
 *
 * What is it?
 * LocalDate represents a date without a time or timezone.
 *
 * Why do we need it?
 * It provides a modern, clear API for date-only business values.
 *
 * Key points:
 * - LocalDate is immutable.
 * - It represents year, month, and day.
 * - It is useful for birthdays, due dates, and business dates.
 *
 * Interview note:
 * Know why java.time is preferred over the older Date/Calendar APIs for modern code.
 */

import java.time.LocalDate;

class Concept01_LocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2026, 9, 28);

        System.out.println("Today: " + today);
        System.out.println("Date: " + date);
        System.out.println("Next day: " + date.plusDays(1));
    }
}