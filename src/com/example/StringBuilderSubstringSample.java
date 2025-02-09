package com.example;

public class StringBuilderSubstringSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEFGHI");
        System.out.println(sb); // ABCDEFGHI
        System.out.println(sb.substring(3, 6)); // DEF
        System.out.println(sb.substring(3)); // DEFGHI
    }
}
