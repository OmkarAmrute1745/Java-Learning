/**
 * Topic: LambdaBasics
 *
 * Java 8 learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_LambdaBasics {

    public static void main(String[] args) {
        Runnable traditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from traditional Runnable");
            }
        };

        traditional.run();

        Runnable lambda = () -> System.out.println("Hello from Lambda");

        lambda.run();
    }
}