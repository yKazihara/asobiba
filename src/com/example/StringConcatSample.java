package com.example;

public class StringConcatSample {
    public static void main(String[] args) {
        String str = "東京都";

        System.out.println(str.concat("港区赤坂")); // 東京都港区赤坂
        System.out.println(str + "港区赤坂"); // 東京都港区赤坂 まぁ結果は一緒だわな
    }
}
