package com.wfxuni;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JDKThreadPoolTest {

    public static void main(String[] args) {

        //Java提供4种默认线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);


        cachedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        fixedThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        singleThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        scheduledThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });
    }
}
