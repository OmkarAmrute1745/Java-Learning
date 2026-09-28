package lambdaexpressions;

@FunctionalInterface
interface Calculator {
    int calculate(int first, int second);
}

public class Concept03_LambdaWithParameters {

    public static void main(String[] args) {
        Calculator addition = (first, second) -> first + second;
        Calculator multiplication = (first, second) -> first * second;

        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
    }
}
