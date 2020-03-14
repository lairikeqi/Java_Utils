package com.wfxuni;

public class SubClass extends SuperClass {

    static {
        consumer.accept("子类静态代码块");
    }

    {
        consumer.accept("子类构造代码块");
    }

    public SubClass() {
        consumer.accept("子类构造函数");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
