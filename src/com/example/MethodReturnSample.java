package com.example;

public class MethodReturnSample {
    public static void main(String[] args) {
        int result;
        String checkResult = "";

        result = bai(9);
        checkResult = check(result);
        System.out.println(result); // 18
        System.out.println(checkResult); // 18は偶数です。

        System.out.println("-----");

        result = bai(5);
        checkResult = check(result + 1); // 計算結果にプラス１しておく。
        System.out.println(result); // 10
        System.out.println(checkResult); // 11は奇数です。
    }

    private static int bai(int n){
        return n * 2;
    }

    private static String check(int n) {
        if (n % 2 == 0){
            return STR."\{n}は偶数です。";
        } else {
            return STR."\{n}は奇数です。";
        }
    }
}
