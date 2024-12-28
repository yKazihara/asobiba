package com.example;

public class StringReplaceSample {
    public static void main(String[] args) {
        String str1 = "Herro Java";
        System.out.println(str1); // Herro Java
        System.out.println(str1.replace('r', 'l')); // Hello Java

        System.out.println("-----");

        String str2= "東京都港区";
        System.out.println(str2); // 東京都港区
        System.out.println(str2.replace("港区", "中央区")); // 東京都中央区
    }
}
