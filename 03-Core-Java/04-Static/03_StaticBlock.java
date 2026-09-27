/**
 * Topic: 03 StaticBlock
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Config {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed");
    }
}

public class 03StaticBlock {

    public static void main(String[] args) {
        System.out.println(Config.value);
    }
}
