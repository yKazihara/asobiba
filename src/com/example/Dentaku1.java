package com.example;

public class Dentaku1 {
    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 8;
        String ope = "kakeru";

        calc(val1, val2, ope);
        // 入力された式は 5 kakeru 8 です
    }

    private static void calc(int val1, int val2, String ope) {
        System.out.println(STR."入力された式は \{val1} \{ope} \{val2} です");
    }
}
