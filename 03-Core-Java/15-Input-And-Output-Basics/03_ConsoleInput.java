/**
 * Topic: ConsoleInput
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_ConsoleInput {

    public static void main(String[] args) {
        java.io.Console console = System.console();
        System.out.println(console == null ? "Console unavailable in this IDE" : "Console available");
    }
}
