package com.wfxuni;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExpansion {

    public static Integer getCapacity(ArrayList list) {
        //Java反射机制
        Integer length = null;
        Class c = list.getClass();
        Field field;
        try {
            field = c.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = new Object[0];
            try {
                objects = (Object[]) field.get(list);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            length = objects.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return length;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            list.add("a" + i);
        }
        Integer length = getCapacity(list);
        int size = list.size();
        System.out.println("容量：" + length);
        System.out.println("大小：" + size);


        HashMap<String,String> hashMap = new HashMap<>(15);
        hashMap.put("1","1");
        hashMap.get("1");
    }
}
