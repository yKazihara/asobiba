package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUnicodeCharacterClassSample {
    public static void main(String[] args) {
        String target1 = "A B";
        String target2 = "A　B";

        String regex = "A\\sB";
        Pattern p1 = Pattern.compile(regex);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}");
        // A B:true

        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}");
        // A　B:false

        System.out.println("-----");

        Pattern p2 = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);

        // Unicode バージョンの定義済み文字クラスで空白文字とマッチする \s は全角スペースにもマッチ
        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}");
        // A B:true

        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}");
        // A　B:true
    }
}
