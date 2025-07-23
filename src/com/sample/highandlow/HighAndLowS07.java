package com.sample.highandlow;

import java.util.Scanner;
public class HighAndLowS07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int leftCard = (int)(Math.random()*9)+1;
            int rightCard = (int)(Math.random()*9)+1;

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

            System.out.println("  [結果表示]");
            System.out.println("*****    *****");
            System.out.println("*   *    *   *");
            System.out.println(STR."* \{leftCard} *    * \{rightCard} *");
            System.out.println("*   *    *   *");
            System.out.println("*****    *****");
            String result = null;

            if(leftCard < rightCard) {
                result = "h";
            } else if (leftCard > rightCard) {
                result = "l";
            } else {
                result = select;
            }

            if(select.equals(result)) {
                System.out.println(" →You Win!");
            } else {
                System.out.println(" →You Lose...");
                break;
            }
            System.out.println();
        }

        System.out.println("--ゲーム終了--");
        //**************
        //* High & Low *
        //**************
        //
        //  [問題表示]
        //*****    *****
        //*   *    * * *
        //* 1 *    * * *
        //*   *    * * *
        //*****    *****
        // High  or  Low ?(h/l)＞h
        // →Highを選択しました。
        //
        //  [結果表示]
        //*****    *****
        //*   *    *   *
        //* 1 *    * 4 *
        //*   *    *   *
        //*****    *****
        // →You Win!
        //
        //**************
        //* High & Low *
        //**************
        //
        //  [問題表示]
        //*****    *****
        //*   *    * * *
        //* 3 *    * * *
        //*   *    * * *
        //*****    *****
        // High  or  Low ?(h/l)＞h
        // →Highを選択しました。
        //
        //  [結果表示]
        //*****    *****
        //*   *    *   *
        //* 3 *    * 5 *
        //*   *    *   *
        //*****    *****
        // →You Win!
        //
        //**************
        //* High & Low *
        //**************
        //
        //  [問題表示]
        //*****    *****
        //*   *    * * *
        //* 9 *    * * *
        //*   *    * * *
        //*****    *****
        // High  or  Low ?(h/l)＞l
        // →Lowを選択しました。
        //
        //  [結果表示]
        //*****    *****
        //*   *    *   *
        //* 9 *    * 4 *
        //*   *    *   *
        //*****    *****
        // →You Win!
        //
        //**************
        //* High & Low *
        //**************
        //
        //  [問題表示]
        //*****    *****
        //*   *    * * *
        //* 9 *    * * *
        //*   *    * * *
        //*****    *****
        // High  or  Low ?(h/l)＞h
        // →Highを選択しました。
        //
        //  [結果表示]
        //*****    *****
        //*   *    *   *
        //* 9 *    * 7 *
        //*   *    *   *
        //*****    *****
        // →You Lose...
        //--ゲーム終了--
    }

}
