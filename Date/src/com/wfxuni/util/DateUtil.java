package com.wfxuni.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class DateUtil {

    private static Consumer consumer = System.out::println;

    private static final DateTimeFormatter DATE_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:dd:ss");

    private static final DateTimeFormatter DATE_DAY_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    /**
     * 获取当前时间
     *
     * @return
     */
    public static String getDate() {
        return LocalDateTime.now().format(DATE_DATE_FORMATTER);
    }

    /**
     * 获取传入时间字符串
     *
     * @param localDateTime
     * @return
     */
    public static String getDate(LocalDateTime localDateTime) {
        return localDateTime.format(DATE_DATE_FORMATTER);
    }

    /**
     * 获取当前日期
     *
     * @return
     */
    public static String getDay() {
        return LocalDateTime.now().format(DATE_DAY_FORMATTER);
    }

    /**
     * 获取传入时间日期
     *
     * @param localDateTime
     * @return
     */
    public static String getDay(LocalDateTime localDateTime) {
        return localDateTime.format(DATE_DAY_FORMATTER);
    }

    /**
     * 返回时间
     *
     * @param localDateTime
     * @param datePattern
     * @return
     */
    public static String getDate(LocalDateTime localDateTime, String datePattern) {
        return localDateTime.format(DateTimeFormatter.ofPattern(datePattern));
    }

    /**
     * 比较两个日期的大小
     * 返回1,beginTime > endTime; 返回0,beginTime = endTime; 返回-1,beginTime < endTime
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public int compareTowDate(LocalDateTime beginTime, LocalDateTime endTime) {
        return getDay(beginTime).compareTo(getDay(endTime));
    }

}
