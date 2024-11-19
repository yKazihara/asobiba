package com.example;

public class RelationalAndEqualityOperatorsSample {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        System.out.println(STR."a = \{a}"); // 7
        System.out.println(STR."b = \{b}"); // 4

        System.out.println(STR."a < b  : \{a < b}"); // false
        System.out.println(STR."a <= b : \{a <= b}"); // false
        System.out.println(STR."a > b  : \{a > b}"); // true
        System.out.println(STR."a >= b : \{a >= b}"); // true
        System.out.println(STR."a == b : \{a == b}"); // false
        System.out.println(STR."a != b : \{a != b}"); // true

        // 別々のオブジェクトのため == 演算子で評価すると false
        int[] aa = {85, 78, 92};
        int[] bb = {85, 78, 92};
        System.out.println(STR."aa == bb : \{aa == bb}");  // false

        // 比較する二つの変数が同じオブジェクトを参照している場合 == 演算子は true
        int[] aaa = {85, 78, 92};
        int[] bbb = aaa;

        System.out.println(STR."aaa == bbb : \{aaa == bbb}");  // true
    }
}
