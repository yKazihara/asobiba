package com.sample.highandlow;

import java.util.Scanner;
public class HighAndLowS04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftCard = (int)(Math.random()*9)+1;

        System.out.println("**************");
        System.out.println("* High & Low *");
        System.out.println("**************");

        System.out.println();

        System.out.println("  [問題表示]");
        System.out.println("*****    *****");
        System.out.println("*   *    * * *");
        System.out.println(STR."* \{leftCard} *    * * *");
        System.out.println("*   *    * * *");
        System.out.println("*****    *****");
        System.out.print(" High  or  Low ?(h/l)＞");
        String select = sc.nextLine();

        if(select.equals("h")) {
            System.out.println(" →Highを選択しました。");
        } else {
            System.out.println(" →Lowを選択しました。");
        }

        System.out.println();

        System.out.println("--ゲーム終了--");
        //**************
        //* High & Low *
        //**************
        //
        //  [問題表示]
        //*****    *****
        //*   *    * * *
        //* 8 *    * * *
        //*   *    * * *
        //*****    *****
        // High  or  Low ?(h/l)＞l
        // →Lowを選択しました。
        //
        //--ゲーム終了--
    }

}
