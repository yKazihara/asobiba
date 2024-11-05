package com.example;

import java.nio.charset.Charset;

public class CheckEncording {
    public static void main(String[] args){
        // デフォルトエンコーディングを確認する UTF-8
        System.out.println(System.getProperty("file.encoding"));

        System.out.println(Charset.defaultCharset().displayName());
    }
}
