package com.wfxuni;

import com.wfxuni.batch.BatchHandler;
import com.wfxuni.utils.StringUtil;

import java.util.*;
import java.util.function.Consumer;

public class main {

    private static Consumer consumer = System.out::println;

    private static boolean coreSwitch;

    public static void main(String[] args) {
        String str = "1,2,wfxuni,bilibili,233,abcdefg";
        List<String> list = Arrays.asList(str.split(","));

        // 先定义一个具备按字母排序功能的Set容器，Set本身即可去重
        Set<String> stringSet = new TreeSet<String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                }
        );

        // 以下for循环完成元素去重、大小转换、长度判断等操作
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (!StringUtil.isNum(s) && s.length() >= 5) {
                // 统一转换成小写
                String slower = s.toLowerCase();
                stringSet.add(slower);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : stringSet) {
            result.append(s);
            result.append("❤");
        }

        // 去掉最后一个多余连接符
        String finalResult = result.substring(0, result.length() - 1).toString();
        consumer.accept(finalResult);
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        new BatchHandler<String>().batchResolve(list2, 10, (items) -> {
            //do something you want...
            System.out.println();
        });

        if (Objects.equals(null, null)) {
            System.out.println("123");
        }

        List<String> list3 = new ArrayList();
        System.out.println(list3.contains("1"));
        list3.add("1");
        System.out.println(list3.contains("1"));

        System.out.println(String.valueOf(coreSwitch));

//        LocalDateTime localDateTime = LocalDateTime.now();
//        String time = localDateTime.getYear() + "年" + localDateTime.getMonthValue() + "月" + localDateTime.getDayOfMonth() + "日";
//        consumer.accept(time);
    }
}
