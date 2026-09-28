/*
 * JAVA IO
 * AREA: NIO Advanced
 * CONCEPT: Files.lines and DirectoryStream
 *
 * What is it?
 * Files.lines and DirectoryStream is an important Java I/O concept.
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

class Concept10_FilesLinesAndDirectoryStream { public static void main(String[] args) throws Exception { var p=java.nio.file.Path.of("lines.txt");java.nio.file.Files.write(p,java.util.List.of("Java","Spring","AWS"));try(var lines=java.nio.file.Files.lines(p)){lines.forEach(System.out::println);}try(var s=java.nio.file.Files.newDirectoryStream(java.nio.file.Path.of("."))){for(var x:s)System.out.println(x);} } }
