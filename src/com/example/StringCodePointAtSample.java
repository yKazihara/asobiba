package com.example;

public class StringCodePointAtSample {
    public static void main(String[] args) {
        String msg = "東京都港区赤坂";

        for (int i = 0; i < msg.length(); i++){
            // Unicode コードポイントを取得
            System.out.println(STR."\{i}；\{msg.codePointAt(i)}");
        }
        //0；26481
        //1；20140
        //2；37117
        //3；28207
        //4；21306
        //5；36196
        //6；22338
    }
}
