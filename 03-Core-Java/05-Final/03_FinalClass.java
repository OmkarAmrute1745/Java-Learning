/**
 * Topic: 03 FinalClass
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
final class Utility {
    static void show() {
        System.out.println("Final class cannot be extended");
    }
}

public class 03FinalClass {

    public static void main(String[] args) {
        Utility.show();
    }
}
