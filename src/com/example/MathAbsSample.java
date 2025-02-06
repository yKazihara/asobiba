package com.example;

public class MathAbsSample {
    public static void main(String[] args) {
        // 数値の絶対値を取得
        int i1 = 24;
        int i2 = -18;
        System.out.println(STR."\{i1} -> \{Math.abs(i1)}"); // 24 -> 24
        System.out.println(STR."\{i2} -> \{Math.abs(i2)}"); // -18 -> 18

        System.out.println("-----");

        double d1 = 14.53;
        double d2 = -7.224;
        System.out.println(STR."\{d1} -> \{Math.abs(d1)}"); // 14.53 -> 14.53
        System.out.println(STR."\{d2} -> \{Math.abs(d2)}"); // -7.224 -> 7.224
    }
}
