package com.sample.console;

import java.util.Scanner;

public class KeyBordInputStringValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("名前を入力して下さい＞");
        String name = sc.nextLine();
        System.out.println(STR."私の名前は、\{name}です。");
        //名前を入力して下さい＞hoge
        //私の名前は、hogeです。
    }
}
