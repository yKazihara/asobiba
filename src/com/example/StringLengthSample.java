package com.example;

public class StringLengthSample {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "東京都港区赤坂";

        System.out.println(STR."\{msg1}の長さは \{msg1.length()}"); // Helloの長さは 5
        System.out.println(STR."\{msg2}の長さは \{msg2.length()}"); // 東京都港区赤坂の長さは 7
    }
}
