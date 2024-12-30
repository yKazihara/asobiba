package com.example;

public class StringMatchesSample {
    public static void main(String[] args) {

        String str0 = "Apple";
        String regex0 = "A.*e";
        // A で始まり任意の文字が 0 回以上続き、 e と続く文字列とマッチ
        System.out.println(str0.matches(regex0)); // true

        System.out.println("-----");

        String str1 = "airplane.png";
        String str2 = "lemon.png";
        String str3 = "apple.jpeg";
        String regex = "a.+png$";

        // a から始まり、任意の文字が 1 回以上続き、 png が続く文字列とマッチ
        System.out.println(str1.matches(regex)); // true
        System.out.println(str2.matches(regex)); // false
        System.out.println(str3.matches(regex)); // false
    }
}
