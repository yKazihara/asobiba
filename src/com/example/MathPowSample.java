package com.example;

public class MathPowSample {
    public static void main(String[] args) {
        double d = 3.0;

        // 1 番目の引数に指定した数値を 2 番目の引数に指定した数値で累乗
        System.out.println(Math.pow(d, 0.0)); // 1.0
        System.out.println(Math.pow(d, 1.0)); // 3.0
        System.out.println(Math.pow(d, 2.0)); // 9.0
        System.out.println(Math.pow(d, 3.0)); // 27.0
        System.out.println(Math.pow(d, 4.0)); // 81.0
        System.out.println(Math.pow(d, 5.0)); // 243.0
    }
}
