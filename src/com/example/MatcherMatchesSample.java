package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMatchesSample {
    public static void main(String[] args){
        // S で始まり、任意の文字が 0 文字以上続いたあと t で終わる文字列
        String regex = "S.*t";
        Pattern p = Pattern.compile(regex);

        Matcher m1 = p.matcher("JavaScript");
        System.out.println(m1.matches()); // false

        Matcher m2 = p.matcher("Script");
        System.out.println(m2.matches()); // true

        Matcher m3 = p.matcher("Set");
        System.out.println(m3.matches()); // true
    }
}
