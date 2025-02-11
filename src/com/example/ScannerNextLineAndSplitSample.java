package com.example;

import java.util.Scanner;

public class ScannerNextLineAndSplitSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("趣味を入力してください。");

        String hobby = scanner.nextLine();
        String[] tokens = hobby.split("\\s+");
        for (int i = 0 ; i < tokens.length; i++){
            System.out.println(STR."[\{i}]\{tokens[i]}");
        }
        //趣味を入力してください。
        //漫画 アニメ コスプレ
        //[0]漫画
        //[1]アニメ
        //[2]コスプレ
    }
}
