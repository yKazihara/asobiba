package com.example;

import java.util.Scanner;

public class ScannerNextSomeValuesSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("年齢と出身地を空白を挟んで入力してください");
        String age = scanner.next();
        String homeTown = scanner.next();

        System.out.println(STR."年齢は\{age}です");
        System.out.println(STR."出身地は\{homeTown}です");
        //年齢と出身地を空白を挟んで入力してください
        //29 大阪府
        //年齢は29です
        //出身地は大阪府です
    }
}
