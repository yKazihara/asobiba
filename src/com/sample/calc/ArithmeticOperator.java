package com.sample.calc;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 計算用の値を管理する変数を宣言し、値を代入
        int a = 9;
        int b = 4;

        // 回答を管理する変数
        int answer;

        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        // 足し算
        answer = a + b;
        System.out.print("a + b : ");
        System.out.println(answer);

        // 引き算
        answer = a - b;
        System.out.print("a - b : ");
        System.out.println(answer);

        //掛け算
        answer = a * b;
        System.out.print("a * b : ");
        System.out.println(answer);

        //割り算
        answer = a / b;
        System.out.print("a / b : ");
        System.out.println(answer);

        //余りを求める
        answer = a % b;
        System.out.print("a % b : ");
        System.out.println(answer);

        //a = 9
        //b = 4
        //a + b : 13
        //a - b : 5
        //a * b : 36
        //a / b : 2
        //a % b : 1
    }
}
