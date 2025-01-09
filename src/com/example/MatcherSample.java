package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherSample {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("g..d");
        Matcher m1 = p1.matcher("good");
        System.out.println(m1.matches()); // true

        System.out.println("-----");

        Pattern p2 = Pattern.compile("g..d");
        Matcher m2 = p2.matcher("bad");
        System.out.println(m2.matches()); // false

        System.out.println("-----");

        String regex1 = "a\\.b"; // エスケープしとく
        Pattern p3 = Pattern.compile(regex1);

        Matcher m3 = p3.matcher("a.b");
        System.out.println(m3.matches()); // true マッチした

        Matcher m4 = p3.matcher("axb");
        System.out.println(m4.matches()); // false

        System.out.println("-----");

        // バックスラッシュだらけだと読みにくい
        // パターンの中をまとめてエスケープしとく
        String regex2 = Pattern.quote("A.B.C.D");
        Pattern p4 = Pattern.compile(regex2);

        Matcher m5 = p4.matcher("A.B.C.D"); // true マッチした
        System.out.println(m5.matches());

        Matcher m6 = p4.matcher("AABBCCDD"); // false
        System.out.println(m6.matches());
    }
}
