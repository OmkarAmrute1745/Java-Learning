/**
 * Topic: 05 StaticVsInstance
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Counter {
    static int shared;
    int value;
}

public class 05StaticVsInstance {

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
