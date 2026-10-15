/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Modern Java
 * CONCEPT: Virtual threads
 *
 * What is it?
 * Virtual threads are lightweight threads managed by the Java runtime.
 *
 * Why do we need it?
 * They can simplify high-concurrency I/O-bound workloads.
 *
 * Key points:
 * - They do not make CPU-bound work inherently faster; blocking I/O and resource limits still matter.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Compare virtual threads with platform threads and asynchronous APIs.
 */

class Concept02_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread task = Thread.startVirtualThread(() -> System.out.println("I/O task running"));
        task.join();
    }
}
