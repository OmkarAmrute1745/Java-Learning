/*
 * JAVA IO
 * AREA: Console And Print
 * CONCEPT: Scanner and BufferedReader
 *
 * What is it?
 * Scanner and BufferedReader is an important Java I/O concept.
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

class Concept06_ScannerBufferedReader { public static void main(String[] args) throws Exception { try(var s=new java.util.Scanner("Omkar 21")){System.out.println(s.next());System.out.println(s.nextInt());}var r=new java.io.BufferedReader(new java.io.StringReader("Pune"));System.out.println(r.readLine()); } }
