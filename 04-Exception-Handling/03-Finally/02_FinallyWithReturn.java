/**
 * Topic: FinallyWithReturn
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
    static int calculate() {
        try {
            return 10;
        } finally {
            System.out.println("Finally executes before the method returns.");
        }
    }

class Concept02_FinallyWithReturn {

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
