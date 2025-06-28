package com.sample.calc;

import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {

        double h = 180;     //身長(単位cm)を管理する変数
        double w = 75;      //体重（単位kg）を管理する変数
        double bmi = 0;     //bmi値を管理する変数

        h = h * 0.01;        // cm --> mに変換（身長に0.01をかけて変換）

        bmi = w / (h * h);  // BMI値 = 体重(kg)÷(身長(m)×身長(m))

        System.out.println(STR."bmiの値は \{bmi}です");
        // bmiの値は 23.148148148148145です
    }
}
