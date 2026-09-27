/**
 * Topic: StaticVsInstance
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Counter {
    static int shared;
    int value;
}

class Concept05_StaticVsInstance {

    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();
        first.value = 10;
        second.value = 20;
        Counter.shared = 100;
        System.out.println(first.value + " " + second.value);
        System.out.println(Counter.shared);
    }
}
