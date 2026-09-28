/*
 * JAVA IO
 * AREA: Byte Streams
 * CONCEPT: File input and output streams
 *
 * What is it?
 * File input and output streams is an important Java I/O concept.
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

class Concept02_FileInputOutputStreams { public static void main(String[] args) throws Exception { try(var out=new java.io.FileOutputStream("output.txt")){out.write("Java IO".getBytes());}try(var in=new java.io.FileInputStream("output.txt")){int b;while((b=in.read())!=-1)System.out.print((char)b);} } }
