package com.sample.variable;

public class ChangeValue1 {
    public static void main(String[] args) {

        //年
        int year = 1964;

        System.out.print("東京オリンピックは");
        System.out.print(year);
        System.out.println("年に、1回目が開催されました。");

        //変数に別の値を代入
        year = 2020;

        System.out.print("2回目は");
        System.out.print(year);
        System.out.println("年に、開催が決定しました！");

        //東京オリンピックは1964年に、1回目が開催されました。
        //2回目は2020年に、開催が決定しました！
    }
}
