package com.example;

public class StringBuilderReplaceSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEF");
        System.out.println(sb); // ABCDEF

        System.out.println("-----");

        sb.replace(2, 4, "12345");
        System.out.println(sb); // AB12345EF

        System.out.println("-----");

        sb.replace(1, sb.length() - 1, "-");
        System.out.println(sb); // A-F
    }
}
