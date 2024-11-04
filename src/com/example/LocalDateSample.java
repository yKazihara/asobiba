package com.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateSample {
    public static void main(String[] args) {

        // DateをSimpleDateFormatでフォーマット
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);
        System.out.println(strDate); // 今日の日付 yyyy-MM-dd形式

        // イラッとするCalendarクラス なんでこんなに書かなきゃいかんの
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.DECEMBER, 4);
        Date calendarDate = calendar.getTime();
        SimpleDateFormat calendarDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strCalendarDate = calendarDateFormat.format(calendarDate);
        System.out.println(strCalendarDate); // 2024-12-04

        // LocalDateはかなり楽
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 今日の日付 yyyy-MM-dd形式
    }
}
