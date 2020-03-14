package com.wfxuni.date;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class NewDate {

    private static Consumer consumer = System.out::println;

    /**
     * 获得日期/时间
     *
     * @return String
     */
    public static String getDate(String datePattern) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(DateTimeFormatter.ofPattern(datePattern));
    }

    /**
     * 反解析 时间字符串
     *
     * @param timeStr
     * @return LocalDateTime
     */
    public static LocalDateTime returnTime(String timeStr) throws DateTimeException {
        LocalDateTime localDateTime = LocalDateTime.parse(timeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return localDateTime;
    }

    public static void main(String[] args) {

        LocalDateTime rightNow = LocalDateTime.now();
        consumer.accept("当前时刻：" + rightNow);
        consumer.accept("当前年份：" + rightNow.getYear());
        consumer.accept("当前月份：" + rightNow.getMonth());
        consumer.accept("当前日：" + rightNow.getDayOfMonth());
        consumer.accept("当前时：" + rightNow.getHour());
        consumer.accept("当前分：" + rightNow.getMinute());
        consumer.accept("当前秒：" + rightNow.getSecond());

        String dataPattern1 = "yyyy-MM-dd";
        String dataPattern2 = "yyyy-MM-dd HH:mm:ss";
        consumer.accept("当前日期：" + getDate(dataPattern1));
        consumer.accept("当前时间：" + getDate(dataPattern2));

        try {
            consumer.accept(returnTime("2012-01-02 11:21:11"));
        } catch (Exception ex) {
            ex.printStackTrace();
            consumer.accept("时间反解析出错,请检查传入时间字符串");
        }

    }
}
