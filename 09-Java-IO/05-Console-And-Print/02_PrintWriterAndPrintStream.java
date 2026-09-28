/*
 * JAVA IO
 * AREA: Console And Print
 * CONCEPT: PrintWriter and PrintStream
 *
 * What is it?
 * PrintWriter and PrintStream is an important Java I/O concept.
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

class Concept07_PrintWriterAndPrintStream { public static void main(String[] args) throws Exception { try(var w=new java.io.PrintWriter(new java.io.StringWriter())){w.println("Java IO");w.printf("Value=%d",100);}System.out.println("PrintStream writes to System.out"); } }
