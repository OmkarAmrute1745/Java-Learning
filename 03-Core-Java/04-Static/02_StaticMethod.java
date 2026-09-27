/**
 * Topic: StaticMethod
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class MathUtil {
    static int square(int number) { return number * number; }
}

class Concept02_StaticMethod {

    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));
    }
}
