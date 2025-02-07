package com.example;

public class MathSqrtCbrtSample {
    public static void main(String[] args) {
        System.out.println(STR."sqrt(16) = \{Math.sqrt(16)}"); // sqrt(16) = 4.0
        System.out.println(STR."sqrt(30) = \{Math.sqrt(30)}"); // sqrt(30) = 5.477225575051661
        System.out.println(STR."sqrt(-25) = \{Math.sqrt(-25)}"); // sqrt(-25) = NaN
        // ↑ 0 よりも小さい数値の平方根を取得しようとすると NaN が返される

        System.out.println("-----");

        System.out.println(STR."cbrt(8) = \{Math.cbrt(8)}"); // cbrt(8) = 2.0
        System.out.println(STR."cbrt(40) = \{Math.cbrt(40)}"); // cbrt(40) = 3.419951893353394
        System.out.println(STR."cbrt(-64) = \{Math.cbrt(-64)}"); // cbrt(-64) = -4.0
    }
}
