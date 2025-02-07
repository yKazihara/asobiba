package com.example;

public class StringBuilderAppendSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("The watch price is ");
        sb.append(100);
        sb.append(" yen.");

        //System.out.println(sb.toString()); ← toString()は不要らしい
        System.out.println(sb);
        // The watch price is 100 yen.
    }
}
