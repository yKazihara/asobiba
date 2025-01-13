package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherRegionSample {
    public static void main(String[] args) {
        String target = "dancer singer";

        String regex = "\\b.*?er";
        Pattern p = Pattern.compile(regex);

        // リージョン（範囲）設定なし
        Matcher m1 = p.matcher(target);
        if (m1.find()) {
            System.out.println(m1.group());
        } else {
            System.out.println("not match");
        }
        // dancer つまり最初にマッチしたものを取得している

        Matcher m2 = p.matcher(target);
        // リージョン（範囲）設定あり
        m2.region(7, 13);
        if (m2.find()) {
            System.out.println(m2.group());
        } else {
            System.out.println("not match");
        }
        // singer つまり範囲指定した部分でマッチしたものを取得している
    }
}
