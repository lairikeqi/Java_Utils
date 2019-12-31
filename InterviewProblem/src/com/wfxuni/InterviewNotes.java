package com.wfxuni;

public class InterviewNotes {

    public static void main(String[] args) {

        compareStr();
        operator();

        getValue(2);
    }

    public static void compareStr() {

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        String str3 = "hello";

        System.out.println("str1 == str2: " + (str1 == str2) + "\nstr1 == str3: " + (str1 == str3));
    }

    public static void operator() {

        int i = 1;
        int j;
        // i++先进行表达式运算，再进行自增运算
        // ++i先进行自增运算，再进行表达式运算
        j = i++;
        System.out.println("\ni: " + i + "\nj: " + j + "\n");
    }

    public static int getValue(int i) {
        int result = 0;
        // switch没有break会继续执行直到default
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;

        }
        return result;
    }

}
