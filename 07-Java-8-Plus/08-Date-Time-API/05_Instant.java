/*
 * JAVA 8+
 * AREA: Date-Time API
 * CONCEPT: Instant
 *
 * What is it?
 * Instant represents a point on the UTC timeline.
 *
 * Why do we need it?
 * It is useful for timestamps that must represent an exact moment.
 *
 * Key points:
 * - Instant is timezone-independent.
 * - It is commonly useful for audit timestamps and distributed systems.
 *
 * Interview note:
 * Understand the difference between an Instant and a local date-time.
 */

import java.time.Instant;

class Concept05_Instant {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();

        System.out.println("Current UTC instant: " + timestamp);
    }
}