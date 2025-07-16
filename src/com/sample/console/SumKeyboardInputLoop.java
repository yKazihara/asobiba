package com.sample.console;

import java.util.Scanner;
public class SumKeyboardInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("合計したい数値を入力してください-->");
            int num = sc.nextInt();
            int total = 0;
            for( int i =  1  ; i <=  num  ;  i++  ) {
                System.out.print(STR."iの値=\{i}");
                total = total + i ;
                System.out.println(STR." 現時点totalの値=\{total}");
            }
            System.out.println(STR."1～\{num}の合計は\{total}です。");
            System.out.println("合計を継続しますか？Yesならy, Noならnを入力してください-->");
            String str = sc.next();
            if(!("y".equals(str))) {
                System.out.println("プログラムを終了します");
                break;
            }
        }
        //合計したい数値を入力してください-->10
        //iの値=1 現時点totalの値=1
        //iの値=2 現時点totalの値=3
        //iの値=3 現時点totalの値=6
        //iの値=4 現時点totalの値=10
        //iの値=5 現時点totalの値=15
        //iの値=6 現時点totalの値=21
        //iの値=7 現時点totalの値=28
        //iの値=8 現時点totalの値=36
        //iの値=9 現時点totalの値=45
        //iの値=10 現時点totalの値=55
        //1～10の合計は55です。
        //合計を継続しますか？Yesならy, Noならnを入力してください-->
        //n
        //プログラムを終了します
    }
}
