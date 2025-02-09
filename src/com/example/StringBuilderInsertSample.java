package com.example;

public class StringBuilderInsertSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ABC");
        sb.append("DEF");
        System.out.println(sb); // ABCDEF

        System.out.println("-----");

        // インデックス2から挿入
        sb.insert(2, "XYZ");
        System.out.println(sb); // ABXYZCDEF

        System.out.println("-----");

        sb = new StringBuilder();
        sb.append("ABCDEF");
        System.out.println(sb); // ABCDEF

        System.out.println("-----");

        // 数字の挿入
        sb.insert(1, 5.7);
        System.out.println(sb.toString());  // A5.7BCDEF

        System.out.println("-----");

        // booleanの挿入
        sb.insert(7, true);
        System.out.println(sb.toString());  // A5.7BCDtrueEF
    }
}
