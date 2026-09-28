/*
 * JAVA MULTITHREADING
 * AREA: Concurrency Practice
 * CONCEPT: Thread-safe counter
 *
 * What is it?
 * A thread-safe counter can be updated safely by multiple threads.
 *
 * Why do we need it?
 * Shared counters are common in metrics, request counts, and statistics.
 *
 * Key points:
 * - AtomicInteger provides atomic increment operations.
 * - It avoids a simple race condition on the counter.
 *
 * Interview note:
 * Know the difference between atomic operations and synchronized blocks.
 */

class Concept02_ThreadSafeCounter {
    static final java.util.concurrent.atomic.AtomicInteger COUNT =
            new java.util.concurrent.atomic.AtomicInteger();

    public static void main(String[] args) throws Exception {
        Thread a = new Thread(() -> { for (int i = 0; i < 1000; i++) COUNT.incrementAndGet(); });
        Thread b = new Thread(() -> { for (int i = 0; i < 1000; i++) COUNT.incrementAndGet(); });
        a.start(); b.start(); a.join(); b.join();
        System.out.println(COUNT.get());
    }
}
