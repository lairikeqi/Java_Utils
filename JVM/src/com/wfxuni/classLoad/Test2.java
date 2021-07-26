package com.wfxuni.classLoad;

public class Test2 {

    // 静态变量
    private static int num = 1;
    // 常量
    private static final int number2 = 30;
    // 成员变量
    private int number3;

    static {
        num = 2;
        number = 20;
        //System.out.println(number);  报错：非法的前向引用
        System.out.println(number2);
        //System.out.println(number3);  报错：类成员变量只有类new时才会被分配内存空间
    }

    // linking阶段prepare: number = 0 --> initial: 20 --> 10
    private static int number = 10;


    public static void main(String[] args) {
        System.out.println(Test2.num);
        System.out.println(Test2.number);
        System.out.println(Test2.number2);
    }
}
