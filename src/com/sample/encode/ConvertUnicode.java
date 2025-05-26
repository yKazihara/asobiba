package com.sample.encode;

public class ConvertUnicode {
    public static void main(String[] args) {

        // 文字「あ」です。
        char c = 'あ';

        // 文字に対応するUnicodeコードを取得します。
        int code = (int)c;

        // 文字コードを表示します。
        System.out.println(code);
        // 12354

        // 文字コードを16進数で表示します。
        System.out.println(Integer.toHexString(code));
        // 3042

    }
}
