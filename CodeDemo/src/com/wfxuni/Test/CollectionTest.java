package com.wfxuni.Test;

import com.wfxuni.pojo.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;

public class CollectionTest {

    private static Consumer consumer = System.out::println;

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.parse("2012-01-02", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINESE));
        Student s1 = new Student("zz", 22, localDate1);

        LocalDate localDate2 = LocalDate.parse("2021-09-15", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH));
        Student s2 = new Student("xr", 18, localDate2);

        // 初始化List
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        // 初始化Map
        Map<String, List<Student>> map = new HashMap<>();
        map.put("class1", studentList);

        // 遍历Map<String,List>
        for (Map.Entry<String, List<Student>> maps : map.entrySet()) {
            ArrayList list = (ArrayList) maps.getValue();
            Iterator<Student> iterator = list.iterator();
            while (iterator.hasNext()) {
                consumer.accept(maps.getKey() + ": " + iterator.next().toString());
            }
        }
    }
}
