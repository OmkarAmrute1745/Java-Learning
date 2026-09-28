/*
 * JAVA IO
 * AREA: Character Streams
 * CONCEPT: Reader, Writer and buffering
 *
 * What is it?
 * Reader, Writer and buffering is an important Java I/O concept.
 *
 * Why do we need it?
 * It helps Java applications read, write, process, and manage data efficiently.
 *
 * Key points:
 * - Understand the concept before memorizing syntax.
 * - Run the example and change the input.
 * - Connect it to a backend use case.
 *
 * Interview note:
 * Explain the concept simply and give one practical example.
 */

class Concept03_ReaderWriterAndBuffering { public static void main(String[] args) throws Exception { try(var r=new java.io.BufferedReader(new java.io.StringReader("Java\nSpring"))){String line;while((line=r.readLine())!=null)System.out.println(line);}try(var w=new java.io.StringWriter()){w.write("Character stream");System.out.println(w);} } }
