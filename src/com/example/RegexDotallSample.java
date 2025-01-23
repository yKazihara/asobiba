package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDotallSample {
    public static void main(String[] args) {
        String target1 = "<p>Lemon is yellow.Strawberry is red</p>";
        String target2 = "<p>Lemon is yellow.\nStrawberry is red</p>";

        String regex = "<p>.*</p>";

        // メタ文字であるドット(.)が行末記号にはマッチしない
        Pattern p1 = Pattern.compile(regex);

        Matcher m1_1 = p1.matcher(target1);
        System.out.println(STR."\{target1}:\{m1_1.find()}");
        Matcher m1_2 = p1.matcher(target2);
        System.out.println(STR."\{target2}:\{m1_2.find()}");
        //<p>Lemon is yellow.Strawberry is red</p>:true
        //<p>Lemon is yellow.
        //Strawberry is red</p>:false

        System.out.println("-----");

        // メタ文字であるドット(.)が行末記号にもマッチ
        Pattern p2 = Pattern.compile(regex, Pattern.DOTALL);

        Matcher m2_1 = p2.matcher(target1);
        System.out.println(STR."\{target1}:\{m2_1.find()}");
        Matcher m2_2 = p2.matcher(target2);
        System.out.println(STR."\{target2}:\{m2_2.find()}");
        //<p>Lemon is yellow.Strawberry is red</p>:true
        //<p>Lemon is yellow.
        //Strawberry is red</p>:true
    }
}
