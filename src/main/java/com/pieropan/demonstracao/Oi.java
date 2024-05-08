package com.pieropan.demonstracao;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Oi {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        Callable<Integer> callable = () -> new Random().nextInt();
        List<Future<Integer>> futures = ex.invokeAll(Collections.nCopies(3, callable));
        futures.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
