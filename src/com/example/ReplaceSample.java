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

        System.out.println("-----");

        // パターンとマッチした文字列全体を、置換する文字列の中から参照
        String target3 = "BB AA CC BB";
        System.out.println(target3); // BB AA CC BB

        String regex3 = "\\b[^ ]+\\b";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m3 = p3.matcher(target3);
        System.out.println(m3.replaceAll("[$0]"));
        // [BB] [AA] [CC] [BB]

        System.out.println("-----");

        // 文字列にマッチした場合、 1 番目の正規表現グループでキャプチャした値と
        // 2 番目の正規表現グループでキャプチャした値を入れ替えて置換
        String target4 = "XA-07 BG-74 AT-35";
        System.out.println(target4); // XA-07 BG-74 AT-35

        String regex4 = "([A-Z]{2})-([0-9]{2})";
        Pattern p4 = Pattern.compile(regex4);

        Matcher m4 = p4.matcher(target4);
        System.out.println(m4.replaceAll("$2:$1"));
        // 07:XA 74:BG 35:AT
    }
}
