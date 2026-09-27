/**
 * Topic: WhatIsException
 *
 * Exception Handling learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_WhatIsException {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
