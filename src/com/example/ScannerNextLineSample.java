package com.example;

import java.util.Scanner;

public class ScannerNextLineSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("趣味を入力してください。");

        String hobby = scanner.nextLine(); // 空白は無視される
        System.out.println(STR."趣味は\{hobby}です");
        //趣味を入力してください。
        //映画鑑賞 写真 読書
        //趣味は映画鑑賞 写真 読書です
    }
}
