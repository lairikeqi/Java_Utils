package com.wfxuni;

import java.util.function.Consumer;

public class SuperClass {

    static Consumer consumer = System.out::println;

    static {
        consumer.accept("父类静态代码块");
    }

    {
        consumer.accept("父类构造代码块");
    }

    public SuperClass() {
        consumer.accept("父类构造函数");
    }



}
