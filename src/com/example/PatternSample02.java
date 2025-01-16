package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSample02 {
    public static void main(String[] args) {
        // 行の先頭から "Red"でマッチするかどうか
        String regex1 = "^Red";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("Red Table");
        System.out.println(m1.find());  // true

        Matcher m2 = p1.matcher("Reduce speed");
        System.out.println(m2.find());  // true

        Matcher m3 = p1.matcher("Border Color is Red");
        System.out.println(m3.find());  // false

        System.out.println("-----");

        // 行の末尾が "Script"でマッチするかどうか
        String regex2 = "Script$";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m4 = p2.matcher("JavaScript");
        System.out.println(m4.find());  // true

        Matcher m5 = p2.matcher("I am studying TypeScript");
        System.out.println(m5.find());  // true

        Matcher m6 = p2.matcher("PostScript is difficult");
        System.out.println(m6.find());  // false

        System.out.println("-----");

        // 文字列の先頭から "che"でマッチするかどうか
        String regex3 = "\\Ache";
        Pattern p3 = Pattern.compile(regex3, Pattern.MULTILINE);

        Matcher m7 = p3.matcher("cheese cake");
        System.out.println(m7.find());  // true

        Matcher m8 = p3.matcher("check out");
        System.out.println(m8.find());  // true

        Matcher m9 = p3.matcher("Apache");
        System.out.println(m9.find());  // false

        System.out.println("-----");

        // 文字列の末尾が  "che"でマッチするかどうか
        String regex4 = "che\\z";
        Pattern p4 = Pattern.compile(regex4);

        Matcher m10 = p4.matcher("cheese cake");
        System.out.println(m10.find());  // false

        Matcher m11 = p4.matcher("page cache");
        System.out.println(m11.find());  // true

        Matcher m12 = p4.matcher("Apache");
        System.out.println(m12.find());  // true

        System.out.println("-----");

        // 単語境界を含めてマッチするか
        String regex5 = "\\bwork";
        Pattern p5 = Pattern.compile(regex5);

        Matcher m13 = p5.matcher("a working person");
        System.out.println(m13.find());  // true

        Matcher m14 = p5.matcher("Go to see fireworks");
        System.out.println(m14.find());  // false

        String regex6 = "ing\\b";
        Pattern p6 = Pattern.compile(regex6);

        Matcher m15 = p6.matcher("a working person");
        System.out.println(m15.find());  // true

        Matcher m16 = p6.matcher("ingenious design");
        System.out.println(m16.find());  // false

        System.out.println("-----");

        // 非単語境界てマッチするか
        String regex7 = "\\Bam";
        Pattern p7 = Pattern.compile(regex7);

        Matcher m17 = p7.matcher("Difficult program");
        System.out.println(m17.find());  // true

        Matcher m18 = p7.matcher("full amount");
        System.out.println(m18.find());  // false

        String regex8 = "am\\B";
        Pattern p8 = Pattern.compile(regex8);

        Matcher m19 = p8.matcher("Difficult program");
        System.out.println(m19.find());  // false

        Matcher m20 = p8.matcher("full amount");
        System.out.println(m20.find());  // true
    }
}
