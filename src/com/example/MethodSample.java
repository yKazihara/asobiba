package com.example;

public class MethodSample {
    public static void main(String[] args) {
        int english = 78;
        int math = 90;
        int japanese = 68;

        check("英語", english); // 英語の試験結果は不合格です
        check("数学", math); // 数学の試験結果は合格です
        check("国語", japanese); // 国語の試験結果は不合格です
    }

    private static void check(String kyoka, int seiseki) {
        System.out.print(STR."\{kyoka}の試験結果は");
        if (seiseki > 80) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }
    }
}
