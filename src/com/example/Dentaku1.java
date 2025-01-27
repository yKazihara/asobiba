package com.example;

public class Dentaku1 {
    public static void main(String[] args) {
        String val1 = "5";
        String val2 = "8";
        String ope = "kakeru";

        print(val1, val2, ope);
        // 入力された式は 5 kakeru 8 です
    }

    private static void print(String val1, String val2, String ope) {
        System.out.println(STR."入力された式は \{val1} \{ope} \{val2} です");
    }
}
