/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: Date Formatting
 *
 * What is it?
 * DateTimeFormatter formats and parses java.time values.
 *
 * Why do we need it?
 * Applications often need a defined format for APIs, reports, and UI.
 *
 * Key points:
 * - Formatting converts date-time values to String.
 * - Parsing converts formatted text into date-time values.
 *
 * Interview note:
 * Prefer DateTimeFormatter with java.time instead of legacy SimpleDateFormat for modern code.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Concept07_DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 9, 28);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = date.format(formatter);
        LocalDate parsed = LocalDate.parse(formatted, formatter);

        System.out.println("Formatted: " + formatted);
        System.out.println("Parsed: " + parsed);
    }
}