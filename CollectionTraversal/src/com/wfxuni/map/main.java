package com.wfxuni.map;

import com.wfxuni.pojo.People;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        Map<String, People> map = new HashMap<>();
        init(map);
        System.out.println("1.keySet遍历key + value (iterator)");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            People people = map.get(key);
            System.out.println("key：" + key + "  姓名：" + people.getName() + "性别：" + people.getSex() + "年龄：" + people.getAge());
        }

        System.out.println("\n2.keySet遍历key + value (foreach)");
        for (String key : map.keySet()) {
            People people = map.get(key);
            System.out.println("key：" + key + "  姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        }

        System.out.println("\n3.entrySet遍历key + value (iterator)");
        Iterator<Map.Entry<String, People>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, People> entry = entries.next();
            String key = entry.getKey();
            People people = entry.getValue();
            System.out.println("key：" + key + "  姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        }

        System.out.println("\n4.entrySet遍历key + value (foreach)");
        for (Map.Entry<String, People> entry : map.entrySet()) {
            String key = entry.getKey();
            People people = entry.getValue();
            System.out.println("key：" + key + "  姓名：" + people.getName() + "  性别：" + people.getSex() + "  年龄：" + people.getAge());
        }
    }

    public static void init(Map<String, People> map) {

        People people1 = new People("小A", "男", 8);
        People people2 = new People("小B", "女", 18);
        People people3 = new People("小C", "男", 24);

        map.put("1", people1);
        map.put("2", people2);
        map.put("3", people3);
    }
}
