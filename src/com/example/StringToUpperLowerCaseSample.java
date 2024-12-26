package com.example;

public class StringToUpperLowerCaseSample {
    public static void main(String[] args) {
        String str1 = "TeaCup";
        String str2 = "Ｍｏｕｓｅ";

        System.out.println(str1); // TeaCup
        System.out.println(str1.toUpperCase()); // TEACUP
        System.out.println(str1.toLowerCase()); //teacup

        System.out.println("-----");

        System.out.println(str2); // Ｍｏｕｓｅ
        System.out.println(str2.toUpperCase()); // ＭＯＵＳＥ
        System.out.println(str2.toLowerCase()); // ｍｏｕｓｅ
    }
}
