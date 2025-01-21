package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample05 {
    public static void main(String[] args) {
        String regex1 = "(?<pref>^.*(?:都|道|府|県))(?<ward>.*区)";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("東京都港区赤坂");
        if (m1.find()){
            System.out.println(m1.group()); // 東京都港区
            System.out.println(m1.group("pref")); // 東京都
            System.out.println(m1.group("ward")); // 港区
        }

        System.out.println("-----");

        String regex2 = "(?<pref>^.*(?:都|道|府|県))(?<ward>.*区)";
        Pattern p2 = Pattern.compile(regex2);

        Matcher m2 = p2.matcher("東京都港区赤坂");
        if (m2.find()){
            System.out.println(m2.group()); // 東京都港区
            System.out.println(m2.group("pref")); // 東京都
            System.out.println(m2.start("pref")); // 0
            System.out.println(m2.end("pref")); // 3
            System.out.println(m2.group("ward")); // 港区
            System.out.println(m2.start("ward")); // 3
            System.out.println(m2.end("ward")); // 5
        }
    }
}
