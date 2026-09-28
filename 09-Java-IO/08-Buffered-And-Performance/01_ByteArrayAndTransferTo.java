/*
 * JAVA IO
 * AREA: Buffered And Performance
 * CONCEPT: ByteArray streams and transferTo
 *
 * What is it?
 * ByteArray streams and transferTo is an important Java I/O concept.
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

class Concept11_ByteArrayAndTransferTo { public static void main(String[] args) throws Exception { var in=new java.io.StringReader("Transfer data");var out=new java.io.StringWriter();in.transferTo(out);System.out.println(out); } }
