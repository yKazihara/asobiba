package com.sample.condition;

public class EqualsMethod {
    public static void main(String[] args) {

        //比較用の文字列を管理する変数の宣言と初期化
        String str = "テスト";

        System.out.println("-- if文開始 --");

        if (str.equals("テスト")) {
            System.out.println("String型の変数strと文字列\"テスト\"とは意味的に等しい。");
        }

        System.out.println("-- if文終了 --");
        //-- if文開始 --
        //String型の変数strと文字列"テスト"とは意味的に等しい。
        //-- if文終了 --
    }
}
