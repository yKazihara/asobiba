package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSample {
    public static void main(String[] args) {
        String regex1 = "Sun";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("Today is Sunday");
        System.out.println(m1.find());  // true

        Matcher m2 = p1.matcher("Sunrise");
        System.out.println(m2.find());  // true

        Matcher m3 = p1.matcher("Ham Sandwich");
        System.out.println(m3.find());  // false

        System.out.println("-----");

        String regex2 = "S..d";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m4 = p2.matcher("Today is Sunday");
        System.out.println(m4.find());  // true

        Matcher m5 = p2.matcher("Sunrise");
        System.out.println(m5.find());  // false

        Matcher m6 = p2.matcher("Ham Sandwich");
        System.out.println(m6.find());  // true

        System.out.println("-----");

        String regex3 = "[Ss]un";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m7 = p3.matcher("Today is Sunday");
        System.out.println(m7.find());  // true

        Matcher m8 = p3.matcher("Sunrise");
        System.out.println(m8.find());  // true

        Matcher m9 = p3.matcher("Ham Sandwich");
        System.out.println(m9.find());  // false

        System.out.println("-----");

        String regex4 = "199[^01234]";
        Pattern p4 = Pattern.compile(regex4);

        Matcher m10 = p4.matcher("My birthday is 1998/03/12");
        System.out.println(m10.find());  // true

        Matcher m11 = p4.matcher("Graduated in 1994");
        System.out.println(m11.find());  // false

        Matcher m12 = p4.matcher("price of eraser is 199yen");
        System.out.println(m12.find());  // true

        System.out.println("-----");

        String regex5 = "199[0-6]";
        Pattern p5 = Pattern.compile(regex5);

        Matcher m13 = p5.matcher("My birthday is 1998/03/12");
        System.out.println(m13.find());  // false

        Matcher m14 = p5.matcher("Graduated in 1994");
        System.out.println(m14.find());  // true

        Matcher m15 = p5.matcher("price of eraser is 199yen");
        System.out.println(m15.find());  // false

        System.out.println("-----");

        String regex6 = "\\d{3}-\\d{4}";
        Pattern p6 = Pattern.compile(regex6);

        Matcher m16 = p6.matcher("〒123-4567 東京都千代田区");
        if (m16.find()){
            System.out.println("マッチしました");
            System.out.println(m16.group());  // 123-4567
        }
    }
}
