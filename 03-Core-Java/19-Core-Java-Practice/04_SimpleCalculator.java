/**
 * Topic: 04 SimpleCalculator
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
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

public class 04SimpleCalculator {

    public static void main(String[] args) {
        System.out.println(calculate(10, 5, '+'));
        System.out.println(calculate(10, 5, '*'));
    }
}
