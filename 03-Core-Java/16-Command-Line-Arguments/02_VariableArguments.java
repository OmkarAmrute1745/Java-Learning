/**
 * Topic: 02 VariableArguments
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

public class 02VariableArguments {

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4));
    }
}
