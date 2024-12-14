package com.example;

import java.util.Arrays;

public class ArraysToStringSample {
    public static void main(String[] args) {
        double[] src1 = {3.75, 0.52, 14.1};

        System.out.println(src1); // [D@2a84aee7 ← デバッグしようとしてよくやっちゃうやつ
        System.out.println(Arrays.toString(src1)); // [3.75, 0.52, 14.1]

        System.out.println("-----");

        // 多次元配列はどうするの？
        int[][] src2 = {{32, 18}, {12, 27}};

        System.out.println(Arrays.toString(src2)); // [[I@a09ee92, [I@30f39991]
        System.out.println(Arrays.deepToString(src2)); // [[32, 18], [12, 27]]
    }
}
