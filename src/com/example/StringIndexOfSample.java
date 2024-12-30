package com.example;

public class StringIndexOfSample {
    public static void main(String[] args) {
        String str1 = "Hello World";

        // indexOfの引数は本当はintだが明示的にキャストしなくても動くみたい。
        System.out.println(str1.indexOf('o'));
        // 4 インデックスだからゼロはじまりなのか。最初に出現したインデックスを返す。

        System.out.println("-----");

        System.out.println(str1.indexOf('o', 5));
        // 7 対象の文字列のインデックス5から順に後ろに検索、'o'が最初に出現したインデックスを返す。

        System.out.println("-----");

        System.out.println(str1.lastIndexOf('o', 6));
        // 4 対象の文字列のインデックス6から順に先頭へ検索、'o'が最初に出現したインデックスを返す。

        System.out.println("-----");

        String str2 = "東京都と京都府";
        System.out.println(str2.indexOf("京都"));
        // 1 これも最初に登場した東「京都」のインデックスを返している。

        System.out.println("-----");

        System.out.println(str2.lastIndexOf("京都"));
        // 4 最後に出現したインデックスを返す。
    }
}
