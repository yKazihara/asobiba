package com.example;

public class IfSample {
    public static void main(String[] args) {
        System.out.println("1から10までの数値で偶数を出力します");

        for (int i = 1 ; i <= 10 ; i++){
            System.out.print(STR."\{i} は");

            if (i % 2 == 0){
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        }

        System.out.println("-----");

        int[] point = {75,94,68};
        String[] name = {"鈴木","本田","遠藤"};

        for (int i = 0; i < 3; i++){
            System.out.print(STR."\{name[i]}さんは");

            if (point[i] > 90){
                System.out.println("判定Aです");
            } else if (point[i] > 70) {
                System.out.println("判定Bです");
            } else {
                System.out.println("判定Cです");
            }
        }
        // 鈴木さんは判定Bです
        // 本田さんは判定Aです
        // 遠藤さんは判定Cです
    }
}
