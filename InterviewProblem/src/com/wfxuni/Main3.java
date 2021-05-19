package com.wfxuni;

public class Main3 {

    public static void main(String[] args) {
        int result = test3();
        System.out.println(result);
    }

    /**
     * 仔细看字节码，你会发现在catch return 语句返回之前，虚拟机会将待返回的值压入操作数栈，等待返回
     * 即使 finally 语句块对 i 进行了修改，但是待返回的值已经确实的存在于操作数栈中了，
     * 所以不会影响程序返回结果。
     */
    public static int test3() {
        //try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            throw new Exception();
            //return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
            // 如果这里有return 上面main方法输出的结果就是10
            // 因为finally中含有return，就会忽略catch中的return
            //return i;
        }
    }
}
