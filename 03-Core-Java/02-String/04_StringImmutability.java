/**
 * Topic: String Immutability
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
public class 04StringImmutability {

    public static void main(String[] args) {
        String value = "Java";
        value.concat(" Backend");
        System.out.println(value);
        value = value.concat(" Backend");
        System.out.println(value);
    }
}
