package com.cotx.test.completablefuture;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 测试CompletableFuture
 */
public class TestCompletableFuture {

    /**
     * Future的测试
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void testDemo1() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "helloworld";
            }
        });

        long start = System.currentTimeMillis();
        while(true){
            if(future.isDone()){
                System.out.println(future.get());
                break;
            }
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    public void testDemo2() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "helloworld";
        });
        System.out.println(future.get());
    }
}
