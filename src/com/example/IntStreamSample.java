package com.example;

import java.util.stream.IntStream;

public class IntStreamSample {
    public static void main(String[] args) {
        int sum = 0;

        // for文で10回繰り返す
        for (int i = 1; i <= 10; i++) {
            // 数値を順に加算する
            sum = sum + i;
        }

        // 集計結果を出力
        System.out.println(sum); // 55

        // 変数を初期化する
        sum = 0;

        // IntStreamで数値を順に1から10まで加算する
        // こんな書き方出来るのかー！
        sum += IntStream.rangeClosed(1, 10).sum();

        // 集計結果を出力
        System.out.println(sum); // 55
    }

}
