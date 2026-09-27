/**
 * Topic: Scanner
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
}
