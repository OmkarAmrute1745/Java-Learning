/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Core Java
 * CONCEPT: Java is pass-by-value
 *
 * What is it?
 * Java passes a copy of each argument value to a method.
 *
 * Why do we need it?
 * Understanding this explains why reassigning a parameter does not replace the caller's variable.
 *
 * Key points:
 * - For objects, the copied value is the reference; the object can still be mutated through it.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Avoid saying Java passes objects by reference.
 */

class Concept03_PassByValue {
    static void changeValue(int number) { number = 99; }
    static void changeFirst(int[] values) { values[0] = 99; }
    public static void main(String[] args) {
        int number = 10;
        int[] values = {10};
        changeValue(number);
        changeFirst(values);
        System.out.println(number);
        System.out.println(values[0]);
    }
}
