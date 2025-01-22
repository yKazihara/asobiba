package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMultilineSample {
    public static void main(String[] args) {
        String target1 = "apple is red\nlemon is yellow";
        String target2 = "lemon is yellow\napple is red";
        String regex = "^apple";

        // 特にフラグ設定なし
        Pattern p1 = Pattern.compile(regex);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}");
        //apple is red
        //lemon is yellow:true

        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}");
        //lemon is yellow
        //apple is red:false

        System.out.println("-----");

        // 複数行モードを有効にするフラグ設定あり
        Pattern p2 = Pattern.compile(regex, Pattern.MULTILINE);

        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}");
        //apple is red
        //lemon is yellow:true

        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}");
        //lemon is yellow
        //apple is red:true 改行していてもマッチする
    }
}
