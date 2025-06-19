package com.sample.variable;

public class ChangeValue2 {
    public static void main(String[] args) {

        //数値を2つ変数に用意
        int num1 = 7;
        int num2 = 4;

        System.out.print("num1 = ");
        System.out.println(num1);
        System.out.print("num2 = ");
        System.out.println(num2);

        System.out.println("*********");

        //num2にnum1の値を代入
        num2 = num1;

        System.out.print("num1 = ");
        System.out.println(num1);
        System.out.print("num2 = ");
        System.out.println(num2);

        //num1 = 7
        //num2 = 4
        //*********
        //num1 = 7
        //num2 = 7
    }
}
