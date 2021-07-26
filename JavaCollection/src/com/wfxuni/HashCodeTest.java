package com.wfxuni;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class HashCodeTest {

    static class Student {

        private int age;
        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(age, name);
//        }


        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student(18, "xiaoming");
        Student student2 = new Student(18, "xiaoming");
        // 因为重写了equals,所以比较的是对象的内容,否则比较的是对象地址
        System.out.println("只重写equals方法，比较student1和student2：" + student1.equals(student2));

        HashMap<Student, String> hashMap = new HashMap<>(16);
        hashMap.put(student1, "1");
        System.out.println("获取key：student1的value：" + hashMap.get(student1));
        System.out.println("获取key：student2的value：" + hashMap.get(student2));

        HashSet<Student> hashSet = new HashSet<>(16);
        hashSet.add(student1);
        hashSet.add(student2);
        System.out.println("没有重写hashCode方法，无法去重：" + hashSet.size());
    }
}
