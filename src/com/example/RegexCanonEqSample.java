package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCanonEqSample {
    public static void main(String[] args) {

        String target = "て\u3099は";

        String regex = "では";
        Pattern p1 = Pattern.compile(regex);

        Matcher m1 = p1.matcher(target);
        System.out.println(STR."\{target}:\{m1.find()}"); // では:false

        System.out.println("-----");

        // "で" と対象の文字列の中の "て"+濁音(\u3099) は正規等価のため、
        // パターンは "て\u3099は" ともマッチ
        Pattern p2 = Pattern.compile(regex, Pattern.CANON_EQ);

        Matcher m2 = p2.matcher(target);
        System.out.println(STR."\{target}:\{m2.find()}"); // では:true
    }
}
