/**
 * Topic: 02 StaticMethod
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class MathUtil {
    static int square(int number) {
        return number * number;
    }
}

public class 02StaticMethod {

    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));
    }
}
