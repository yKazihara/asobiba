package com.example;

public class StringBuilderSetLengthSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEF");
        System.out.println(STR."[\{sb.toString()}]"); // [ABCDEF]
        System.out.println(sb.length()); // 6

        System.out.println("-----");

        sb.setLength(3);
        System.out.println(STR."[\{sb.toString()}]"); // [ABC]
        System.out.println(sb.length()); // 3

        System.out.println("-----");

        sb.setLength(6);
        System.out.println(STR."[\{sb.toString()}]"); // [ABC   ]
        System.out.println(sb.length()); // 6
    }
}
