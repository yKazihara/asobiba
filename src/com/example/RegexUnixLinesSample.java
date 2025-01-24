package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUnixLinesSample {
    public static void main(String[] args) {
        String target1 = "Thank You!\r\nGood Bye";
        String target2 = "Good Bye\nThank You!";
        String target3 = "Good Bye\r\nThank You!";
        String regex = "Bye$";

        Pattern p1 = Pattern.compile(regex, Pattern.MULTILINE);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}");
        //Thank You!
        //Good Bye:true

        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}");
        //Good Bye
        //Thank You!:true

        Matcher m1_3 = p1.matcher(target3);
        System.out.println(STR."\{target3}:\{m1_3.find()}");
        //Good Bye
        //Thank You!:true

        System.out.println("-----");

        //  \n のみ行末記号として認識するフラグ設定
        Pattern p2 = Pattern.compile(regex, Pattern.MULTILINE|Pattern.UNIX_LINES);

        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}");
        //Thank You!
        //Good Bye:true

        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}");
        //Good Bye
        //Thank You!:true

        Matcher m2_3 = p2.matcher(target3);
        System.out.println(STR."\{target3}:\{m2_3.find()}");
        //Good Bye
        //Thank You!:false
    }
}
