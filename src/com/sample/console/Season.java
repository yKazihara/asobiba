package com.sample.console;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("１から１２のうち、好きな月を１つ入力しなさい-->");
        int num = sc.nextInt();

        if(num == 3) {
            System.out.println(STR."\{num}月は春です。");
        } else if(num == 6) {
            System.out.println(STR."\{num}月は夏です。");
        } else if(num == 9) {
            System.out.println(STR."\{num}月は秋です。");
        } else if(num == 12) {
            System.out.println(STR."\{num}月は冬です。");
        } else {
            System.out.println("3，6，9，12以外の数値が入力されました");
        }
        //１から１２のうち、好きな月を１つ入力しなさい-->3
        //3月は春です。
        //プロセスは終了コード 0 で終了しました
    }
}
