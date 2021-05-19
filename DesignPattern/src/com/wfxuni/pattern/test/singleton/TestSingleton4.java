package com.wfxuni.pattern.test.singleton;

import com.wfxuni.pattern.singleton.Singleton4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton4 {

    public static void main(String[] args) {

        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();

        System.out.println(s1 == s2);

        Callable<Singleton4> callable = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            Future<Singleton4> future1 = executorService.submit(callable);
            Future<Singleton4> future2 = executorService.submit(callable);

            Singleton4 singleton1 = future1.get();
            Singleton4 singleton2 = future2.get();

            System.out.println(singleton1 == singleton2);
            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
