/**
 * Topic: StaticBlock
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Config {
    static int value;
    static { value = 100; }
}

class Concept03_StaticBlock {

    public static void main(String[] args) {
        System.out.println(Config.value);
    }
}
