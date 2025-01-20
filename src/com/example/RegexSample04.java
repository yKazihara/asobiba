package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample04 {
    public static void main(String[] args) {
        // グループの指定は（）で囲う
        String regex1 = "(\\d{3})-(\\d{4})";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("〒123-4567");
        if (m1.find()){
            System.out.println(m1.group());   // 123-4567
            System.out.println(m1.group(0));  // 123-4567 グループ0は全部か
            System.out.println(m1.group(1));  // 123
            System.out.println(m1.group(2));  // 4567
        }

        System.out.println("-----");

        String regex2 = "(\\d{3})-(\\d{4})";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m2 = p2.matcher("〒123-4567");
        if (m2.find()){
            // グループを指定してインデックスが取れる
            System.out.println(m2.group(1)); // 123
            System.out.println(m2.start(1)); // 1
            System.out.println(m2.end(1)); // 4

            System.out.println(m2.group(2)); // 4567
            System.out.println(m2.start(2)); // 5
            System.out.println(m2.end(2)); // 9
        }

        System.out.println("-----");

        String regex3 = "((\\d{3})-(\\d{4}))";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m3 = p3.matcher("〒123-4567");
        if (m3.find()){
            // グループ数取得
            System.out.println(m3.groupCount());  // 3

            for (int i = 1; i <= m3.groupCount(); i++){
                System.out.println(m3.group(i));
            }
            //123-4567
            //123
            //4567
        }

        System.out.println("-----");

        // グループ化を行うけれどキャプチャを行わない指定
        String regex4 = "製品(?:Code|コード):([A-Z]{2})-(\\d{2})";
        Pattern p4 = Pattern.compile(regex4);

        Matcher m4 = p4.matcher("製品コード:AZ-07");
        if (m4.find()){
            System.out.println(m4.groupCount());  // 2 パターンは3つあるが1つはマッチとしてカウントされない
            System.out.println(m4.group(1));      // AZ
            System.out.println(m4.group(2));      // 07
        }
    }
}
