package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSample {
    public static void main(String[] args) {
        // 対象の文字列の中で AA|BB とマッチする最初の文字列を FF に置換
        String target1 = "DD AA CC BB EE";
        System.out.println(target1); // DD AA CC BB EE

        String regex1 = "AA|BB";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher(target1);
        System.out.println(m1.replaceFirst("FF"));
        // DD FF CC BB EE

        System.out.println("-----");

        // パターンとマッチしたすべての文字列を指定の文字列と置換
        String target2 = "DD AA CC BB EE";
        System.out.println(target2); // DD AA CC BB EE

        String regex2 = "AA|BB";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m2 = p2.matcher(target2);
        System.out.println(m2.replaceAll("FF"));
        // DD FF CC FF EE
    }
}
