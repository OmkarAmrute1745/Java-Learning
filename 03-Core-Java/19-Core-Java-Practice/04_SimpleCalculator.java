/**
 * Topic: SimpleCalculator
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static double calculate(double first, double second, char operator) {
        return switch (operator) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> second != 0 ? first / second : 0;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

class Concept04_SimpleCalculator {

    public static void main(String[] args) {
        System.out.println(calculate(10, 5, '+'));
        System.out.println(calculate(10, 5, '*'));
    }
}
