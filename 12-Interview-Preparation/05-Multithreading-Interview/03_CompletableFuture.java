/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Multithreading
 * CONCEPT: CompletableFuture
 *
 * What is it?
 * CompletableFuture represents an asynchronous computation that can be composed with later steps.
 *
 * Why do we need it?
 * It helps combine independent tasks and handle results without manually coordinating every thread.
 *
 * Key points:
 * - thenApply transforms a result; thenCompose chains async work; exceptionally handles failures.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Discuss executor choice and exception handling in async pipelines.
 */

import java.util.concurrent.CompletableFuture;
class Concept03_CompletableFuture {
    public static void main(String[] args) {
        String result = CompletableFuture.supplyAsync(() -> "cloudpm")
                .thenApply(String::toUpperCase)
                .exceptionally(ex -> "FALLBACK")
                .join();
        System.out.println(result);
    }
}
