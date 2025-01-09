package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherSample {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("g..d");
        Matcher m1 = p1.matcher("good");
        System.out.println(m1.matches()); // true

        System.out.println("-----");

        Pattern p2 = Pattern.compile("g..d");
        Matcher m2 = p2.matcher("bad");
        System.out.println(m2.matches()); // false
    }
}
