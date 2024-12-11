package com.example;

import java.util.Arrays;

public class ArraysEqualsSample {
    public static void main(String[] args) {
        int a1 = 7;
        int b1 = 7;

        System.out.println(a1 == b1); // true

        System.out.println("-----");

        int[] a2 = {85, 78, 92};
        int[] b2 = {85, 78, 92};

        // 配列オブジェクト自体が異なるので＝＝で比較するとfalse
        System.out.println(a2 == b2); // false

        int[] a3 = {85, 78, 92};
        int[] b3 = a3;

        // 同じa3を参照しているので＝＝で比較するとtrue
        System.out.println(a3 == b3); // true

        System.out.println("-----");

        int[] a4 = {85, 78, 92};
        int[] b4 = {85, 78, 92};

        // 配列の要素数と値を比較できる
        System.out.println(Arrays.equals(a4, b4)); // true

        int[] a5 = {85, 78, 92};
        int[] b5 = {85, 92, 78};

        // 要素数は同じだが値が異なるためfalse
        System.out.println(Arrays.equals(a5, b5));// false

        System.out.println("-----");

        int[] a6 = {85, 78, 92};
        int[] b6 = {85, 78, 92, 80};

        // 要素数が異なる
        System.out.println(Arrays.equals(a6, b6)); // false

        System.out.println("-----");

        int[] a7 = {85, 78, 92};
        int[] b7 = a7;
        int[] c7 = {85, 78, 92};

        System.out.println(a7 == b7); // trueだよな、参照元同じだし
        System.out.println(a7 == c7); // falseだよな、違うオブジェクトだし
        System.out.println(b7 == c7); // falseだよな、違うオブジェクトだし
        System.out.println(Arrays.equals(a7, b7)); // 要素の数と要素の値が一致しているのでtrue
        System.out.println(Arrays.equals(a7, c7)); // 要素の数と要素の値が一致しているのでtrue
        System.out.println(Arrays.equals(b7, c7)); // 要素の数と要素の値が一致しているのでtrue

        System.out.println("-----");

        int[][] a8 = {{85, 78}, {92,58}};
        int[][] b8 = {{85, 78}, {92,58}};

        // Arrays.equalsは1次元配列の場合のみ要素の値が等しいか比較が行える
        System.out.println(Arrays.equals(a8, b8)); // false
        // Arrays.deepEqualsなら2次元配列も比較が可能
        System.out.println(Arrays.deepEquals(a8, b8)); // true

        System.out.println("-----");

        int[][] a9 = {{10, 8} ,{9, 14}};
        int[][] b9 = a9;
        int[][] c9 = {{10, 8}, {9, 14}};
        int[][] d9 = {{10, 8}, {9, 12}};

        System.out.println(Arrays.equals(a9, b9)); // 参照なのでtrueが返ってきちゃってる
        System.out.println(Arrays.equals(a9, c9)); // 2次元配列の比較だからfalse
        System.out.println(Arrays.equals(b9, c9)); // 2次元配列の比較だからfalse
        System.out.println(Arrays.deepEquals(a9, b9)); // true
        System.out.println(Arrays.deepEquals(a9, c9)); // true
        System.out.println(Arrays.deepEquals(b9, c9)); // true
        System.out.println(Arrays.deepEquals(b9, d9)); // 値がちがうからfalse
    }
}
