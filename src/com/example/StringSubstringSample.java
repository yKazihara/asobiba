package com.example;

public class StringSubstringSample {
    public static void main(String[] args) {
        String msg = "東京都港区赤坂";

        System.out.println(msg.substring(3, 5)); // 港区
        System.out.println(msg.substring(5, 7)); // 赤坂
        System.out.println(msg.substring(3)); // 港区赤坂
    }
}
