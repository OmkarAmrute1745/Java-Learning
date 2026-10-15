/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Multithreading
 * CONCEPT: Race condition and synchronization
 *
 * What is it?
 * A race condition occurs when the result depends on uncontrolled timing between threads.
 *
 * Why do we need it?
 * Synchronization protects shared mutable state from conflicting updates.
 *
 * Key points:
 * - A synchronized critical section provides mutual exclusion and visibility guarantees.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain why incrementing a counter is a read-modify-write operation, not one atomic action.
 */

class Concept01_SynchronizedCounter {
    static class Counter {
        private int value;
        synchronized void increment() { value++; }
        synchronized int get() { return value; }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread a = new Thread(() -> { for (int i=0;i<1000;i++) counter.increment(); });
        Thread b = new Thread(() -> { for (int i=0;i<1000;i++) counter.increment(); });
        a.start(); b.start(); a.join(); b.join();
        System.out.println(counter.get());
    }
}
