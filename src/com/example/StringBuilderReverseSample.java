package com.example;

public class StringBuilderReverseSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEFG");
        System.out.println(sb); // ABCDEFG

        System.out.println("-----");

        sb.reverse();
        System.out.println(sb); // GFEDCBA

        System.out.println("-----");

        sb.reverse();
        System.out.println(sb); // ABCDEFG
    }
}
