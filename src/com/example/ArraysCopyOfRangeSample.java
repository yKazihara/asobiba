package com.example;

import java.util.Arrays;

public class ArraysCopyOfRangeSample {
    public static void main(String[] args) {
        // 配列の指定範囲の要素から新しい配列を作成
        int[] src = {12, 24, 18, 35, 21};
        int[] dst = Arrays.copyOfRange(src, 1, 4);

        System.out.println(Arrays.toString(src)); // [12, 24, 18, 35, 21]
        System.out.println(Arrays.toString(dst)); // [24, 18, 35]

        src[1] = 42; // もしコピー元を書き換えても・・・

        System.out.println(Arrays.toString(src)); // [12, 42, 18, 35, 21]
        // 参照元が同じではないので、コピー先は書き換わらない
        System.out.println(Arrays.toString(dst)); // [24, 18, 35]
    }
}
