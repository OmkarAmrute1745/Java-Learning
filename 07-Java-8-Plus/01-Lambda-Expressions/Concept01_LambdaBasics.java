package lambdaexpressions;

public class Concept01_LambdaBasics {

    public static void main(String[] args) {
        // Traditional anonymous class
        Runnable traditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from traditional Runnable");
            }
        };

        traditional.run();

        // Lambda expression
        Runnable lambda = () -> System.out.println("Hello from Lambda");

        lambda.run();
    }
}
