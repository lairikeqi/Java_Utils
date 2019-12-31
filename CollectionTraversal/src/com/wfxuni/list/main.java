package com.wfxuni.list;

import com.wfxuni.pojo.People;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        init(list);

        System.out.println("1. for循环遍历 ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + "  性别：" + list.get(i).getSex() + "  年龄：" + list.get(i).getAge());
        }

        System.out.println("\n2. foreach遍历 ");
        for (People people : list) {
            System.out.println("姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        }

        System.out.println("\n3. Iterator迭代器遍历 ");
        Iterator<People> iterator = list.iterator();
        while (iterator.hasNext()) {
            People people = iterator.next();
            System.out.println("姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        }

        System.out.println("\n4. foreach遍历 java8 Lambda方式");
        list.forEach(people -> {
            System.out.println("姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        });

    }

    private static void init(List<People> list) {

        People people1 = new People("小A", "男", 8);
        People people2 = new People("小B", "女", 18);
        People people3 = new People("小C", "男", 24);

        list.add(people1);
        list.add(people2);
        list.add(people3);
    }
}
