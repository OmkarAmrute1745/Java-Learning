/**
 * Topic: 01 StaticVariable
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Counter {
    static int count;

    Counter() {
        count++;
    }
}

public class 01StaticVariable {

    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();
        System.out.println(Counter.count);
    }
}
