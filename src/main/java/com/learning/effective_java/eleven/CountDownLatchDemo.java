package com.learning.effective_java.eleven;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * @author kian
 * @date 2019/7/2
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
//Executor executor = new
    }

    public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);
        for (int i = 0; i < concurrency; i++) {
            executor.execute(() -> {
                try {
                    start.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }
        ready.wait();
        long startNanos = System.nanoTime();
        System.out.println(startNanos);
        start.countDown();
        done.wait();
        return System.nanoTime() - startNanos;

    }
}