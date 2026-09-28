/*
 * JAVA IO
 * AREA: File And NIO
 * CONCEPT: Path and Files API
 *
 * What is it?
 * Path and Files API is an important Java I/O concept.
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

class Concept09_PathAndFiles { public static void main(String[] args) throws Exception { var p=java.nio.file.Path.of("notes.txt");java.nio.file.Files.writeString(p,"Java NIO");System.out.println(p.getFileName());System.out.println(java.nio.file.Files.readString(p)); } }
