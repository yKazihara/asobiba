package com.example;

public class StringBuilderDeleteSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("ABCdefGHI");
        System.out.println(sb); // ABCdefGHI

        System.out.println("-----");

        sb.delete(3, 6);
        System.out.println(sb); // ABCGHI

        System.out.println("-----");

        sb.delete(0, sb.length());
        System.out.println(sb); // (表示なし)
    }
}
