package com.zxcvsd.base.util;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeDateUtil {

    public static String getDateDayStrNow() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(formatter);
    }

    public static String stampToDate(Long stamp) {
        // 将毫秒时间戳转换为 Instant 对象
        Instant instant = Instant.ofEpochMilli(stamp);
        // 根据系统默认时区将 Instant 转换为 LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        // 定义日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 格式化日期
        String formattedDate = localDateTime.format(formatter);
        return formattedDate;
    }

    public static Long DateToStamp(String dateStr) {
        // 定义日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 将字符串解析为 LocalDateTime 对象
        LocalDateTime localDateTime = LocalDateTime.parse(dateStr, formatter);
        // 获取系统默认时区
        ZoneId defaultZone = ZoneId.systemDefault();
        // 将 LocalDateTime 转换为 ZonedDateTime
        ZonedDateTime zonedDateTime = localDateTime.atZone(defaultZone);
        // 获取毫秒时间戳
        long timestamp = zonedDateTime.toInstant().toEpochMilli();
        return timestamp;
    }

}
