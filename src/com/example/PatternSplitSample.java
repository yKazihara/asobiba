package com.example;

import java.util.regex.Pattern;

public class PatternSplitSample {
    public static void main(String[] args) {
        // 分割回数の制限に、 -1 、 0 、 2 をそれぞれ指定して文字列を分割した結果を取得
        String regex  = "\\|";
        Pattern p = Pattern.compile(regex);

        String[] result = p.split("AA|BBB|CC|", -1);
        for (String s : result) {
            System.out.println(STR."[\{s}]");
        }
        //[AA]
        //[BBB]
        //[CC]
        //[]

        System.out.println("-----");

        result = p.split("AA|BBB|CC|", 0);
        for (String s : result) {
            System.out.println(STR."[\{s}]");
        }
        //[AA]
        //[BBB]
        //[CC]

        System.out.println("-----");

        result = p.split("AA|BBB|CC|", 2);
        for (String s : result) {
            System.out.println(STR."[\{s}]");
        }
        //[AA]
        //[BBB|CC|]
    }
}
