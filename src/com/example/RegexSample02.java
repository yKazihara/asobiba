package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample02 {
    public static void main(String[] args) {
        // 最初に H 、続いて a の文字が 0 回以上続き、そのあとに n が続く文字列にマッチ
        String regex1 = "Ha*n";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("Hn");
        System.out.println(m1.find());  // あ、aは0回以上だからtrueになるのか

        Matcher m2 = p1.matcher("Han");
        System.out.println(m2.find());  // true

        Matcher m3 = p1.matcher("Haaaaaan");
        System.out.println(m3.find());  // true

        Matcher m4 = p1.matcher("HaaYaan");
        System.out.println(m4.find());  // false

        System.out.println("-----");

        // 最初に H 、続いて a の文字が 1 回以上続き、そのあとに n が続く文字列にマッチ
        String regex2 = "Ha+n";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m5 = p2.matcher("Hn");
        System.out.println(m5.find());  // aがないからfalseだな

        Matcher m6 = p2.matcher("Han");
        System.out.println(m6.find());  // true

        Matcher m7 = p2.matcher("Haaaaaan");
        System.out.println(m7.find());  // true

        Matcher m8 = p2.matcher("HaaYaan");
        System.out.println(m8.find());  // false

        System.out.println("-----");

        // 最初に H 、続いて a の文字が 0 回か 1 回続き、そのあとに n が続く文字列にマッチ
        String regex3 = "Ha?n";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m9 = p3.matcher("Hn");
        System.out.println(m9.find());  // true

        Matcher m10 = p3.matcher("Han");
        System.out.println(m10.find());  // true

        Matcher m11 = p3.matcher("Haaaaaan");
        System.out.println(m11.find());  // aは0回か1回だからfalse

        Matcher m12 = p3.matcher("Hon");
        System.out.println(m12.find());  // false

        System.out.println("-----");

        // 最初に H 、続いて a の文字が 2 回続き、そのあとに n が続く文字列にマッチ
        String regex4 = "Ha{2}n";
        Pattern p4 = Pattern.compile(regex4);

        Matcher m13 = p4.matcher("Hn");
        System.out.println(m13.find());  // false

        Matcher m14 = p4.matcher("Han");
        System.out.println(m14.find());  // aが2回じゃないからfalse

        Matcher m15 = p4.matcher("Haan");
        System.out.println(m15.find());  // true

        Matcher m16 = p4.matcher("Haaan");
        System.out.println(m16.find());  // aが2回じゃないからfalse

        System.out.println("-----");

        // 最初に A 、続いて a の文字が 2 回以上 3 回以下繰り返し、そのあとに n が続く文字列にマッチ
        String regex5 = "Ha{2,3}n";
        Pattern p5 = Pattern.compile(regex5);

        Matcher m17 = p5.matcher("Hn");
        System.out.println(m17.find());  // false

        Matcher m18 = p5.matcher("Han");
        System.out.println(m18.find());  // false

        Matcher m19 = p5.matcher("Haan");
        System.out.println(m19.find());  // true

        Matcher m20 = p5.matcher("Haaan");
        System.out.println(m20.find());  // true

        Matcher m21 = p5.matcher("Haaaan");
        System.out.println(m21.find());  // false

        System.out.println("-----");

        // <em> のあとに任意の文字が 0 文字以続き、そのあとで </em> が続く文字列とマッチ
        String regex6 = "<em>.*</em>";
        Pattern p6 = Pattern.compile(regex6);

        Matcher m22 = p6.matcher("<p>今日は<em>快晴の</em>一日です</p>");
        if (m22.find()){
            System.out.println(m22.group());  // <em>快晴の</em>
        }

        // 数値が 3 つ続いたあと、ハイフン(-)が続き、そのあとで数値が 4 つ続く文字列とマッチ
        String regex7 = "[0-9]{3}-[0-9]{4}";
        Pattern p7 = Pattern.compile(regex7);

        Matcher m23 = p7.matcher("郵便番号は〒123-4567です");
        if (m23.find()){
            System.out.println(m23.group());  // 123-4567
        }

        System.out.println("-----");

        // 数値が 1 から 3 個続き、そのあとに文字のドット(.)が続く組み合わせが 3 回続いたあと、
        // 最後に数値が 1 から 3 個続く文字列とマッチ
        String regex8 = "([0-9]{1,3}\\.){3}[0-9]{1,3}";
        Pattern p8 = Pattern.compile(regex8);

        Matcher m24 = p8.matcher("IPアドレスは192.168.0.18です");
        if (m24.find()){
            System.out.println(m24.group());  // 192.168.0.18
        }
    }
}
