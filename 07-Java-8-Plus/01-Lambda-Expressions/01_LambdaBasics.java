/*
 * JAVA 8+
 * AREA: Lambda Expressions
 * CONCEPT: Lambda Basics
 *
 * What is it?
 * A lambda expression is a short way to provide the implementation of a functional interface.
 *
 * Why do we need it?
 * It reduces anonymous-class boilerplate and makes behavior easier to read.
 *
 * Key points:
 * - Lambda syntax uses ->.
 * - A lambda is used with a functional interface.
 * - The body can contain one expression or multiple statements.
 *
 * Interview note:
 * Be able to explain why Java 8 introduced lambdas and their relationship with functional interfaces.
 */

class Concept01_LambdaBasics {
    public static void main(String[] args) {
        Runnable traditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };

        traditional.run();

        Runnable lambda = () -> System.out.println("Hello from Lambda");
        lambda.run();
    }
}