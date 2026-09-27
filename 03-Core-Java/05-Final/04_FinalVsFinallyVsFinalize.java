/**
 * Topic: 04 FinalVsFinallyVsFinalize
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 04FinalVsFinallyVsFinalize {

    public static void main(String[] args) {
        final int value = 10;
        try {
            System.out.println(value);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
