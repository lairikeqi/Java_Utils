package com.wfxuni.pojo;

public class SuperClass {

    static {
        System.out.println("父类静态代码块...");
    }

    static {
        System.out.println("父类静态代码块2...");
    }

    {
        System.out.println("父类代码块...");
    }

    public SuperClass(){
        System.out.println("父类构造方法...");
    }

    public static void staticMethod() {
        System.out.println("调用父类静态方法...");
    }

}
