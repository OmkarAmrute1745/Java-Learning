/**
 * Topic: PropagatingException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static void levelOne() {
        levelTwo();
    }

    static void levelTwo() {
        int value = 10 / 0;
        System.out.println(value);
    }

class Concept04_PropagatingException {

    public static void main(String[] args) {
        try {
            levelOne();
        } catch (ArithmeticException exception) {
            System.out.println("Handled at main: " + exception.getMessage());
        }
    }
}
