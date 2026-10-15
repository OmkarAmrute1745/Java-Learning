/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Core Java
 * CONCEPT: == versus equals
 *
 * What is it?
 * For objects, == compares references while equals can compare logical values when overridden.
 *
 * Why do we need it?
 * Choosing the correct comparison avoids subtle bugs in conditions and collections.
 *
 * Key points:
 * - String overrides equals to compare character content.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain the difference between primitive comparison and object comparison.
 */

class Concept02_EqualsVsDoubleEquals {
    public static void main(String[] args) {
        String first = new String("Java");
        String second = new String("Java");
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
