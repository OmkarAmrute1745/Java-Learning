/* JAVA MODERN JAVA
 * AREA: Java 11-14
 * CONCEPT: String methods, text blocks and switch expressions
 * What is it? Modern syntax and APIs for common text and decision logic.
 * Why do we need it? They reduce boilerplate and improve readability.
 * Key points: strip, lines, repeat, text blocks, switch expressions.
 * Interview note: Explain switch expression versus traditional switch statement.
 */
class Concept02_StringTextBlocksSwitch{public static void main(String[]args){System.out.println(" Java ".strip());System.out.println("ha".repeat(3));String json="""
{"name":"Java","version":21}
""";System.out.println(json);int n=2;String day=switch(n){case 1->"MONDAY";case 2->"TUESDAY";default->"OTHER";};System.out.println(day);}}