/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: Date-Time Practice
 *
 * What is it?
 * Practice combines date calculations and formatting.
 *
 * Why do we need it?
 * Date-time logic appears frequently in backend applications.
 *
 * Key points:
 * - Use the type that matches the business meaning.
 * - Keep formatting at system boundaries when possible.
 *
 * Interview note:
 * Explain which java.time type you would choose for a business requirement.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Concept08_DateTimePractice {
    public static void main(String[] args) {
        LocalDate dueDate = LocalDate.of(2026, 10, 15);
        LocalDate today = LocalDate.of(2026, 9, 28);

        System.out.println("Days until due date: "
                + java.time.temporal.ChronoUnit.DAYS.between(today, dueDate));

        System.out.println(dueDate.format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}