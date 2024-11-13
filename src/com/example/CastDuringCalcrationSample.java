package com.example;

public class CastDuringCalcrationSample {
    public static void main(String[] args) {
        double double1 = 10 * 0.2; // どちらかの値が double 型の場合は他の値を double 型に変換
        System.out.println(STR."double1=：\{double1}"); // double1=：2.0

        int int1 = (int)(10 * 0.2); // doubleじゃなくてどうしてもintにしたい？
        System.out.println(STR."int1=：\{int1}"); // int1=：2

        short short1 = 14;
        short short2 = 8;
        // short short3 = short1 + short2; これはエラーになる。shortはintに変換されてから演算されるから。
        int int2 = short1 + short2;
        System.out.println(STR."int2=：\{int2}"); // int2=：22

        short short3 = (short)(short1 + short2); // どーしてもshortの変数に代入したいならキャスト
        System.out.println(STR."short3=：\{short3}"); // short3=：22

        short short4 = 12;
        // short short5 = -short4; shortで符号反転はエラーだってさ。やっぱりintに変換されてから符号反転されるから。
        short short5 = (short)-short4; // どーしてもshortの変数に代入したいならキャスト
        System.out.println(STR."short5=：\{short5}"); // short5=：-12
        // そもそもあんまり実務でshort使ったこと無いかも・・・。
    }
}
