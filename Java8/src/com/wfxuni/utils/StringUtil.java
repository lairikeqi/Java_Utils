package com.wfxuni.utils;

public class StringUtil {

    /**
     * 判断输入字符是否为数字
     * 是：返回true   否：返回false
     *
     * @param str
     */
    public static Boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
