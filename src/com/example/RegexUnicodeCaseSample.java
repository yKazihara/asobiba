package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUnicodeCaseSample {
    public static void main(String[] args) {
        String target1 = "ｂｏｏｋ";
        String target2 = "ＢＯＯＫ";

        String regex = "ｂｏｏｋ";
        Pattern p1 = Pattern.compile(regex);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}");
        // ｂｏｏｋ:true

        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}");
        // ＢＯＯＫ:false

        System.out.println("-----");

        // Unicode 準拠文字であっても大文字と小文字を区別しないようになる
        Pattern p2 = Pattern.compile(
                regex,Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}");
        // ｂｏｏｋ:true

        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}");
        // ＢＯＯＫ:true
    }
}
