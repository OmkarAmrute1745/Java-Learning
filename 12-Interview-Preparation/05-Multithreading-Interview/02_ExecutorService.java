/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Multithreading
 * CONCEPT: ExecutorService
 *
 * What is it?
 * ExecutorService separates task submission from the mechanism used to run tasks.
 *
 * Why do we need it?
 * It manages worker threads and reuses them instead of creating one thread for every task.
 *
 * Key points:
 * - Always shut down an executor when its lifecycle ends.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Compare raw Thread creation with a managed thread pool.
 */

import java.util.concurrent.*;
class Concept02_ExecutorService {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> result = pool.submit(() -> 20 + 22);
            System.out.println(result.get());
        } finally {
            pool.shutdown();
        }
    }
}
