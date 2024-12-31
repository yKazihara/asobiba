package com.example;

public class StringSplitSample {
    public static void main(String[] args) {
        String regex  = ";|:";
        String str = "赤色:青色;黄色:;";

        String[] result = str.split(regex, 0); // 分割する回数に制限なし（空文字含まない）
        for (int i = 0 ; i < result.length; i++){
            System.out.println(STR."[\{result[i]}]");
        }
        //[赤色]
        //[青色]
        //[黄色]

        System.out.println("-----");

        result = str.split(regex, -1); // 分割する回数に制限なし（空文字含む）
        for (int i = 0 ; i < result.length; i++){
            System.out.println(STR."[\{result[i]}]");
        }
        //[赤色]
        //[青色]
        //[黄色]
        //[]
        //[]

        System.out.println("-----");

        result = str.split(regex, 2); // 分割する回数に制限あり：2
        for (int i = 0 ; i < result.length; i++){
            System.out.println(STR."[\{result[i]}]");
        }
        //[赤色]
        //[青色;黄色:;]
    }
}
