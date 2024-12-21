package com.example;

public class StringCodePointCountSample {
    public static void main(String[] args) {
        String kanjiMsg = "東京都港区赤坂";
        String hankakuKanaMsg = "ﾄｳｷｮｳﾄﾐﾅﾄｸｱｶｻｶ";
        String zenkakuKanaMsg = "トウキョウトミナトクアカサカ";

        System.out.println(kanjiMsg.codePointCount(0, kanjiMsg.length())); // 7

        // 半角カナだろうが全角カナだろうが、文字数を取りたい時はこれ
        System.out.println(hankakuKanaMsg.codePointCount(0, hankakuKanaMsg.length())); // 14
        System.out.println(zenkakuKanaMsg.codePointCount(0, zenkakuKanaMsg.length())); // 14
    }
}
