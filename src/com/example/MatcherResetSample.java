package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherResetSample {
    public static void main(String[] args) {
        String regex  = "AA|BB|CC";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher("AA BB CC");
        // 1回目のfind
        if (m.find()){
            System.out.println(m.group()); // AA
        }

        // 2回目のfind
        if (m.find()){
            System.out.println(m.group()); // 次に進むのでBBがマッチ
        }

        // リセット
        m.reset();

        // 3回目のfind
        if (m.find()){
            System.out.println(m.group());  // もどってAAがマッチ
        }
    }
}
