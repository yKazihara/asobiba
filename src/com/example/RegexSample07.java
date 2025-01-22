package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample07 {
    public static void main(String[] args) {
        String[] target = {"apple", "Apple", "APPLE"};
        String regex = "apple";

        // 特にフラグ設定なし
        Pattern p1 = Pattern.compile(regex);

        for (String str : target) {
            Matcher m = p1.matcher(str);
            System.out.println(STR."\{str}:\{m.find()}");
        }
        //apple:true
        //Apple:false
        //APPLE:false

        System.out.println("-----");

        // 大文字と小文字を区別しないフラグ設定あり
        Pattern p2 = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for (String str : target) {
            Matcher m = p2.matcher(str);
            System.out.println(STR."\{str}:\{m.find()}");
        }
        //apple:true
        //Apple:true
        //APPLE:true
    }
}
