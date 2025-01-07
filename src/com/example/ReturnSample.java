package com.example;

public class ReturnSample {
    public static void main(String[] args) {
        test(15, 4); // 15 / 4 = 3
        test(7, 0); // 0で割ることはできません
    }

    private static void test(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("0で割ることはできません");
            return; // ここでreturnすることで0割が防げる
        }

        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}
