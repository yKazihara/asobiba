package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {
    public static void main(String[] args) {
        // A のあとに B が 1 回以上続くパターンにマッチ 最長一致数量子
        String regex1 = "AB+";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("ABBBC");
        if (m1.find()){
            System.out.println(m1.group()); // ABBB
        }

        System.out.println("-----");

        // A のあとに B が 1 回以上続くパターンにマッチ 最短一致数量子
        String regex2 = "AB+?";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m2 = p2.matcher("ABBBC");
        if (m2.find()){
            System.out.println(m2.group()); // AB
        }

        System.out.println("-----");

        // A のあとに B が 1 回以上続くパターンにマッチ 強欲な数量子(絶対最大指定子)
        String regex3 = "AB++";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m3 = p3.matcher("ABBBC");
        if (m3.find()){
            System.out.println(m3.group()); // ABBB
        }
    }
}
