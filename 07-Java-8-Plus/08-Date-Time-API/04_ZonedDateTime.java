/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: ZonedDateTime
 *
 * What is it?
 * ZonedDateTime represents date-time information together with a timezone.
 *
 * Why do we need it?
 * It is important for applications operating across multiple regions.
 *
 * Key points:
 * - Contains a ZoneId.
 * - Handles timezone-aware date-time calculations.
 *
 * Interview note:
 * Use timezone-aware types when business events must be tied to a region.
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;

class Concept04_ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime londonTime =
                indiaTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("India: " + indiaTime);
        System.out.println("London: " + londonTime);
    }
}