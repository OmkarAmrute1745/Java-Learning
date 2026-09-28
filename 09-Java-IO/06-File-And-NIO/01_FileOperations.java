/*
 * JAVA IO
 * AREA: File And NIO
 * CONCEPT: Copy, move and delete files
 *
 * What is it?
 * Copy, move and delete files is an important Java I/O concept.
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

class Concept08_FileOperations { public static void main(String[] args) throws Exception { var s=java.nio.file.Path.of("source.txt");var d=java.nio.file.Path.of("copy.txt");java.nio.file.Files.writeString(s,"Java IO");java.nio.file.Files.copy(s,d,java.nio.file.StandardCopyOption.REPLACE_EXISTING);System.out.println(java.nio.file.Files.deleteIfExists(s)); } }
