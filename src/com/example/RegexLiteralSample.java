package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLiteralSample {
    public static void main(String[] args) {
        String target1 = "A1B";
        String target2 = "A240B";
        String target3 = "A[0-9]*B";

        String regex = "A[0-9]*B";
        Pattern p1 = Pattern.compile(regex);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}"); // A1B:true

        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}"); // A240B:true

        Matcher m1_3 = p1.matcher(target3);
        System.out.println(STR."\{target3}:\{m1_3.find()}"); // A[0-9]*B:false

        System.out.println("-----");

        // パターンの中のメタ文字が特別な意味を持たなくなる
        Pattern p2 = Pattern.compile(regex, Pattern.LITERAL);

        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}"); // A1B:false

        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}"); // A240B:false

        Matcher m2_3 = p2.matcher(target3);
        System.out.println(STR."\{target3}:\{m2_3.find()}"); // A[0-9]*B:true
    }
}
