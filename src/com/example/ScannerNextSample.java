package com.example;

import java.util.Scanner;

public class ScannerNextSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("年齢を入力してください");
        // 入力された値の中で区切り文字(デフォルトでは空白文字)までの値を受け取り次の処理へ
        String age = scanner.next();

        System.out.println(STR."年齢は\{age}です");
        //年齢を入力してください
        //(入力)35
        //年齢は35です
    }
}
