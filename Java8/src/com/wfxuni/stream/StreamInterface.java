package com.wfxuni.stream;

import com.wfxuni.utils.StringUtil;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamInterface {

    private static Consumer consumer = System.out::println;

    public static void main(String[] args) {

        String str = "1,2,wfxuni,bilibili,233,abcdefg";
        List<String> list = Arrays.asList(str.split(","));

        List<String> list2 = Arrays.stream(str.split(","))
                //.map(s -> s.trim())
                .collect(Collectors.toList());
        list2.add("3");

        //.map(s -> s.trim()) 去除字符串的头尾空格
        //.map(s -> Long.parseLong(s.trim())) 转成Long类型

        String result = list.stream()  //首先将列表转化为Stream流
                .filter(i -> !StringUtil.isNum(i))  //首先筛选出字母型字符串
                .filter(i -> i.length() >= 5)  //其次筛选出长度>=5的字符串
                .map(i -> i.toLowerCase())     //字符串统一转小写
                .distinct()                    //去重操作
                .sorted(Comparator.naturalOrder())  //字符串排序
                .collect(Collectors.joining("❤"));  //连词成句

        consumer.accept(result);
    }
}
