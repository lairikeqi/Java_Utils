package com.wfxuni;

import java.util.Arrays;

public class Main4 {


    public static void main(String[] args) {

        int a = 1; // 基本类型
        Integer b = new Integer(10); // 引用类型
        int[] c = {1, 2};  // 引用类型
        String d = "d";  // 引用类型

        test(a, b, c,d);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + Arrays.toString(c));
        System.out.println("d: " + d);
    }

    public static void test(int a, Integer b, int[] c, String d) {
        a = 2;
        b = 20;  // 等价于 b = new Integer(20)
        c[0] = 2;
        d += "hello"; // 等价于 d = new String(d + "hello")
    }
}
