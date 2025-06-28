package com.sample.console;

import java.util.Scanner;

public class BmiKeyboardInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("身長(単位cm)を入力して下さい＞");
        double h = sc.nextDouble();
        System.out.print("体重（単位kg）を入力して下さい＞");
        double w = sc.nextDouble();

        double bmi=0;     //bmi値を管理する変数

        h = h * 0.01;     // cm --> mに変換（身長に0.01をかけて変換）

        bmi = w / ( h * h );  // BMI値 = 体重(kg)÷(身長(m)×身長(m))

        System.out.println(STR."bmiの値は \{bmi}です");
        //身長(単位cm)を入力して下さい＞160
        //体重（単位kg）を入力して下さい＞50
        //bmiの値は 19.531249999999996です
    }
}