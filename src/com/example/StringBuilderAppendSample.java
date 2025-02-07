package com.example;

public class StringBuilderAppendSample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("The watch price is ");
        sb1.append(100);
        sb1.append(" yen.");

        //System.out.println(sb1.toString()); ← toString()は不要らしい
        System.out.println(sb1);
        // The watch price is 100 yen.

        System.out.println("-----");

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hey");
        sb2.append(75.2);
        sb2.append(18L);
        sb2.append(true);

        // appendには数値やbooleanもそのまま突っ込めて文字列に変換される
        System.out.println(sb2);
        // Hey75.218true

        System.out.println("-----");

        String msg = "Hello! Tarou";
        System.out.println(msg); // Hello! Tarou

        StringBuilder sb3 = new StringBuilder(msg);
        sb3.append(" Bye.");
        msg = sb3.toString();

        System.out.println(msg); // Hello! Tarou Bye.
    }
}
