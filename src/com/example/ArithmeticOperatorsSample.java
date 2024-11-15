package com.example;

public class ArithmeticOperatorsSample {
    public static void main(String[] args) {
        System.out.println("10 + 4 = " + (10 + 4)); // 14
        System.out.println("9 - 2 = " + (9 - 2)); // 7
        System.out.println("3 * 8 = " + (3 * 8)); // 24
        System.out.println("7 / 3 = " + (7 / 3)); // 2
        System.out.println("7 % 3 = " + (7 % 3)); // 1
        System.out.println("-----");
        System.out.println("10.1 + 4.3 = " + (10.1 + 4.3)); // 14.399999999999999
        System.out.println("9.4 - 2.8 = " + (9.4 - 2.8)); // 6.6000000000000005
        System.out.println("3.3 * 8.1 = " + (3.3 * 8.1)); // 26.729999999999997
        System.out.println("11.4 / 3.5 = " + (11.4 / 3.5)); // 3.257142857142857
        System.out.println("11.4 % 3.5 = " + (11.4 % 3.5)); // 0.9000000000000004
        System.out.println("-----");
        System.out.println("10 / 4 = " + 10 / 4); // 2
        System.out.println("10.0 / 4.0 = " + 10.0 / 4.0); // 2.5

        // どっちかがdoubleだとdoubleになるのね。
        System.out.println("10 / 4.0 = " + 10 / 4.0); // 2.5
        System.out.println("10.0 / 4 = " + 10.0 / 4); // 2.5
        System.out.println("-----");
        int num1 = 10;
        int num2 = 4;
        System.out.println(num1 / num2); // 2
        System.out.println(num1 / (double)num2); // 2.5
        System.out.println("-----");
        // int i = 10 / 0; 実行時にエラー
        // int j = 10 % 0; 実行時にエラー
        double d1 = 10.0 / 0;
        System.out.println(d1); // Infinity
        double d2 = 10.0 % 0; // Infinity
        System.out.println(d1);
        System.out.println(10.0f / 0); // Infinity
        System.out.println(10.0f % 0); // NaN
    }
}
