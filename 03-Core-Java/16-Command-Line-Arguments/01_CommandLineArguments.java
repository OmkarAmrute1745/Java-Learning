/**
 * Topic: CommandLineArguments
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_CommandLineArguments {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments supplied");
        }
    }
}
