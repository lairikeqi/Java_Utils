package com.wfxuni.pojo;

public class SubClass extends SuperClass {

    static { System.out.println("子类静态代码块..."); }

    { System.out.println("子类代码块..."); }

    public SubClass() { System.out.println("子类构造方法..."); }

    public static void staticMethod2() { System.out.println("调用子类静态方法..."); }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println("-------------------------------");
        SubClass subClass2 = new SubClass();
        //SuperClass.staticMethod();
        //SubClass.staticMethod2();
    }
}
