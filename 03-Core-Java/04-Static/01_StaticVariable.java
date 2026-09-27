/**
 * Topic: StaticVariable
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Counter {
    static int count;
    Counter() { count++; }
}

class Concept01_StaticVariable {

    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println(Counter.count);
    }
}
