package com.example;

public class IncrementAndDecrementSample {
    public static void main(String[] args) {
        int num = 5;

        num++; // 後置
        System.out.println(num); // 6
        num--; // 後置
        System.out.println(num); // 5
        ++num; // 前置
        System.out.println(num); // 6
        --num; // 前置
        System.out.println(num); // 5

        int x = 5;
        int y;
        y = x++; // yに5を代入してからxをインクリメントしている
        System.out.println(x);  // 6
        System.out.println(y);  // 5

        int xx = 5;
        int yy;

        yy = ++xx; // xxをインクリメントしてからyyに代入している
        System.out.println(xx);  // 6
        System.out.println(yy);  // 6
    }
}
