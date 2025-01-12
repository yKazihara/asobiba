package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindSample {
    public static void main(String[] args) {
        // 対象の文字列の中でパターンとマッチする部分があるか
        String regex1 = "[0-9]{2}";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("CODE24-11-75");
        if (m1.find()){
            System.out.println("マッチしました");
            System.out.println(m1.group());
        }
        //マッチしました
        //24

        System.out.println("-----");

        // 対象の文字列でパターンが複数の箇所でマッチする場合、順番にマッチした部分を取得
        String regex2 = "[0-9]{2}";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m2 = p2.matcher("CODE24-11-75");
        while (m2.find()){
            System.out.println(m2.group());
        }
        //24
        //11
        //75
    }
}
