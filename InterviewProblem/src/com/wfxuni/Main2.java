package com.wfxuni;

public class Main2 {

    public static void main(String[] args) {

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2); //false,因为new了两个,分别为指向堆的那个两个地址

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); //true,s3和s4为指向常量池的那块地址
        System.out.println(s3 == s1); //false,指向堆的地址和指向常量池的地址比较

        String s5 = "abcabc";
        String s6 = s3 + s4;
        //false,因为String类是一个不可变对象,对字符串相加会通过new StringBuild()方式创建一个新的对象
        System.out.println(s5 == s6);

        final String s7 = "abc";
        final String s8 = "abc";
        System.out.println(s7 == s8); //true,同上,因为String类默认是被final修饰的

        String s9 = s7 + s8;
        //true,s7和s8用final修饰了,所以是常量,不同于s3和s4是变量
        //编译器在处理常量运算时,最后还是会把他转成一个常量
        System.out.println(s5 == s9);

        final String s10 = s3 + s4;
        System.out.println(s5 == s10); //false,先new了再fianl,指向内存地址已改变
    }
}
