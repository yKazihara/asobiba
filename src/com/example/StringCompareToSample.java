package com.example;

public class StringCompareToSample {
    public static void main(String[] args) {
        String str1 = "AAAAAAAA";
        String str2 = "AAAAAAAA";
        String str3 = "AAA";
        String str4 = "ABCD";

        System.out.println(str1.compareTo(str2)); // 0 全く同じ
        System.out.println(str1.compareTo(str3)); // 5　長さが＋5つ違いがある
        System.out.println(str1.compareTo(str4)); // -1
        // 1つ目と4つ目の文字列はインデックス 1 の文字の値が異なりますので、
        // 1 つ目の文字列の chartAt(1) の値から 2 つ目の文字列の charAt(1) の
        // 値を引いた -1 が戻り値となります。ってどういうこと？！

        System.out.println("-----");

        String str5 = "東京都港区";
        String str6 = "東京都港区";
        String str7 = "東京都";
        String str8 = "東京都中央区";

        System.out.println(str5.compareTo(str6)); // 0
        System.out.println(str5.compareTo(str7)); // 2
        System.out.println(str5.compareTo(str8)); // 8194って何かと思ったら↓を確認
        System.out.println(str5.charAt(3) + ":" + Integer.toString(str5.charAt(3))); // 港:28207
        System.out.println(str5.charAt(3) + ":" + Integer.toString(str8.charAt(3))); // 港:20013

        System.out.println("-----");

        // 業務的に使うチャンスとしては、文字比較してゼロなら〜それ以外なら〜っていうのが多いのかな
        String aaa = "aaa";
        String aab = "aab";

        if (aaa.compareTo(aab) == 0) {
            System.out.println("2つの文字列は同じです。");
        } else {
            System.out.println("2つの文字列は違いますねー。"); // こっちが出力される
        }

    }
}
