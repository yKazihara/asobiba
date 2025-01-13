package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherStartEndGroupSample {
    public static void main(String[] args) {
        String regex = ".区";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher("東京都港区赤坂");
        if (m.find()){
            System.out.println(STR."Start : \{m.start()}"); // 3 インデックスなんで0はじまりなのね
            System.out.println(STR."End   : \{m.end()}"); // 5 マッチした次のインデックスってことか
            System.out.println(STR."Match : \{m.group()}"); // 港区
        }
    }
}
