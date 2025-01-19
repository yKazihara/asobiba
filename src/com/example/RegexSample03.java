package com.example;

import java.util.regex.*;
public class RegexSample03 {
    public static void main(String[] args) {
        // blue または Blue とマッチ
        String regex1 = "blue|Blue";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("My favorite color is blue");
        System.out.println(m1.find()); // true

        Matcher m2 = p1.matcher("bluebird weather");
        System.out.println(m2.find()); // true

        Matcher m3 = p1.matcher("Cobalt BLUE");
        System.out.println(m3.find()); // false

        System.out.println("-----");

        // 単語境界で始まり、 blue または Blue のどちらかが続き、
        // 最後にまた単語境界が続く文字列とマッチ
        String regex2 = "\\b(blue|Blue)\\b";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m5 = p2.matcher("Border Color is Blue");
        System.out.println(m5.find()); // true

        Matcher m6 = p2.matcher("My favorite color is LightBlue");
        System.out.println(m6.find()); // false

        Matcher m7 = p2.matcher("blue cheese");
        System.out.println(m7.find()); // true

        Matcher m8 = p2.matcher("bluebird weather");
        System.out.println(m8.find()); // false

        System.out.println("-----");

        // 0 から 3 までの数値が 3 つ並んだ文字列、
        // または 0 から 7 までの数値が 4 つ並んだ文字列、のどちらかとマッチ
        String regex3 = "<[0-3]{3}>|<[0-7]{4}>";
        Pattern p3 = Pattern.compile(regex3);

        Matcher m9 = p3.matcher("<012>");
        System.out.println(m9.find()); // true

        Matcher m10 = p3.matcher("<0246>");
        System.out.println(m10.find()); // true

        Matcher m11 = p3.matcher("<0248>");
        System.out.println(m11.find()); // false
    }
}
