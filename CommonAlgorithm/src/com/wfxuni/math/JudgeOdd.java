package com.wfxuni.math;

// https://zhuanlan.zhihu.com/p/57859872
public class JudgeOdd {

    // 判断是否是奇数
    public static boolean isOdd(int i) {
        return (i & 1) == 1;
    }

    public static void main(String[] args) {
        int i = 7;
        int[] arrs1 = {-11, -2, -1, 0, 4, 9};
        // isOdd
        for (i = 0; i < arrs1.length; i++) {
            System.out.println(arrs1[i] + ": " + (isOdd(arrs1[i]) ? "奇数" : "偶数"));
        }
    }
}
