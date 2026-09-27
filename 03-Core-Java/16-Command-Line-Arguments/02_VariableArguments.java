/**
 * Topic: VariableArguments
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) total += number;
        return total;
    }

class Concept02_VariableArguments {

    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }
}
