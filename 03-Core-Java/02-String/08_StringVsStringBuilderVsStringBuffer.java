/**
 * Topic: StringVsStringBuilderVsStringBuffer
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept08_StringVsStringBuilderVsStringBuffer {

    public static void main(String[] args) {
        String text = "Java";
        StringBuilder builder = new StringBuilder(text);
        StringBuffer buffer = new StringBuffer(text);
        builder.append(" Builder");
        buffer.append(" Buffer");
        System.out.println(text);
        System.out.println(builder);
        System.out.println(buffer);
    }
}
