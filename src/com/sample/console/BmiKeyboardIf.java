package com.sample.console;

import java.util.Scanner;

public class BmiKeyboardIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("身長(単位cm)を入力して下さい＞");
        double h = sc.nextDouble();
        System.out.print("体重（単位kg）を入力して下さい＞");
        double w = sc.nextDouble();

        double bmi = 0;             //bmi値を管理する変数
        h = h * 0.01;               // cm --> mに変換（身長に0.01をかけて変換）
        bmi = w / ( h * h );        // BMI値 = 体重(kg)÷(身長(m)×身長(m))
        System.out.println(STR."bmiの値は \{bmi}です");

        if(bmi < 18.5) {
            System.out.println("Yasegimidesu");
        } else if (bmi >=18.5 && bmi<25.0){
            System.out.println("Futsuudesu");
        } else if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("Futorigimidesu");
        } else if (bmi > 30.0){
            System.out.println("Futorisugidesu");
        }
        //身長(単位cm)を入力して下さい＞160
        //体重（単位kg）を入力して下さい＞51
        //bmiの値は 19.921874999999996です
        //Futsuudesu
    }
}
