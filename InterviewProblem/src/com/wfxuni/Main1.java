package com.wfxuni;

public class Main1 {

    public static void main(String[] args) {

        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i1 == i2); //false, ==比较引用类型时比较的是栈上对象的引用地址值

        Integer i3 = 126;
        Integer i4 = 126;
        int i5 = 126;
        //true, 引用类型=基本类型,这里用到了自动装箱,自动调用Integer.valueOf()
        //Integer.valueOf() 如果在指定范围内，直接获取数据中对应包装类的引用
        System.out.println(i3 == i4);
        System.out.println(i3 == i5); //true,引用类型和基本类型比较时,引用类型自动拆箱

        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i6 == i7); //false,128超过指定范围了,装箱相当于new Integer()
        System.out.println(i6 == i8); //true,同上,引用类型拆箱为基本类型
    }
}
