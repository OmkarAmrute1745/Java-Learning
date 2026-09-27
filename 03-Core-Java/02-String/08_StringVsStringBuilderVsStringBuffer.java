/**
 * Topic: String vs StringBuilder vs StringBuffer
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 08StringVsStringBuilderVsStringBuffer {

    public static void main(String[] args) {
        StringBuilder value = new StringBuilder("Java");
        value.append(" Backend");
        System.out.println(value);
    }
}
