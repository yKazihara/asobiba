package com.sample.console;

import java.util.Scanner;

public class KeyBordInputIntValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の数字を入力して下さい＞");
        int num1 = sc.nextInt();
        System.out.print("2つ目の数字を入力して下さい＞");
        int num2 = sc.nextInt();

        System.out.println(STR."\{num1} + \{num2} = \{num1 + num2}");
        //1つ目の数字を入力して下さい＞2
        //2つ目の数字を入力して下さい＞5
        //2 + 5 = 7
    }
}
