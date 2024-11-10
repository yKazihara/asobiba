package com.example;

public class VarSample {

    public static void main(String[] args) {
        var old = 24;
        var familyName = "Yamada";
        // var firstName = null; 型推論の場合、nullで初期化はエラーになる。

        System.out.println(STR."年齢：\{old}"); // 年齢：24
        System.out.println(STR."姓：\{familyName}"); // 姓：Yamada
    }
}
