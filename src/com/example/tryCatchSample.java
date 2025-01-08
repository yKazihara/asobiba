package com.example;

public class tryCatchSample {
    public static void main(String[] args) {
        int[] n = {18, 29, 36};

        System.out.println("開始します");

        try {
            for (int i = 0; i < 4; i++){
                System.out.println(n[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }

        System.out.println("終了しました");
    }
    //開始します
    //18
    //29
    //36
    //配列の範囲を超えています
    //終了しました
}
