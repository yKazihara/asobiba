package com.sample.loop;

public class ContinueStatement {
    public static void main(String[] args) {

        System.out.println("**ループ開始**");
        while(true) {

            //1から9のランダムな数値を取得
            int num = (int)(Math.random()*9)+1;

            if(num==4) {
                //4の場合は再度ループの先頭に戻る
                System.out.println(STR."\{num}が出たので、ループの先頭へ戻ります！");
                continue;
            }

            //ランダム数値の表示
            System.out.println(STR."ランダム数値=\{num}");

            if(num%2==0) {
                //偶数数値なら無限ループから抜ける
                System.out.println("4以外の偶数数値が出たので、ループから抜けます！");
                break;
            }
        }
        System.out.println("**ループ終了**");
        //**ループ開始**
        //ランダム数値=1
        //ランダム数値=7
        //ランダム数値=8
        //4以外の偶数数値が出たので、ループから抜けます！
        //**ループ終了**
    }
}
