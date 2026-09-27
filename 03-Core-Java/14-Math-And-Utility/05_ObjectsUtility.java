/**
 * Topic: 05 ObjectsUtility
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 05ObjectsUtility {

    public static void main(String[] args) {
        String value = null;
        System.out.println(java.util.Objects.requireNonNullElse(value, "Unknown"));
    }
}
