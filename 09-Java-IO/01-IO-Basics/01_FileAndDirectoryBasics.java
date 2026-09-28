/*
 * JAVA IO
 * AREA: IO Basics
 * CONCEPT: File and directory basics
 *
 * What is it?
 * File and directory basics is an important Java I/O concept.
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

class Concept01_FileAndDirectoryBasics { public static void main(String[] args) throws Exception { var f=new java.io.File("sample.txt");System.out.println(f.getName());System.out.println(f.getAbsolutePath());System.out.println(f.exists()); } }
