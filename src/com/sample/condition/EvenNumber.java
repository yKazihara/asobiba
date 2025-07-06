package com.sample.condition;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力-->");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(STR."入力数値[\{num}]は偶数です。");
        } else {
            System.out.println(STR."入力数値[\{num}]は奇数です。");
        }
        //数値を入力-->5
        //入力数値[5]は奇数です。
    }
}
