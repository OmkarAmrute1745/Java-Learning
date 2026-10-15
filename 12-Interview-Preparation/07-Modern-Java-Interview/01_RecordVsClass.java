/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Modern Java
 * CONCEPT: Record versus class
 *
 * What is it?
 * A record is a concise data carrier with generated accessors, equals, hashCode, and toString.
 *
 * Why do we need it?
 * It reduces boilerplate for data-focused models.
 *
 * Key points:
 * - Records are shallowly immutable and cannot extend another class.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * A JPA entity often needs identity and lifecycle behavior, so a record is not a universal replacement.
 */

record EmployeeRecord(int id, String name) {}
class Concept01_RecordVsClass {
    public static void main(String[] args) {
        var first = new EmployeeRecord(10, "Asha");
        var second = new EmployeeRecord(10, "Asha");
        System.out.println(first);
        System.out.println(first.equals(second));
    }
}
