package com.example;

public class OverloadsSample {
    public static void main(String[] args) {
        // メソッド名がすべてplusだが、引数の形が異なるためこのように実装できる。
        System.out.println(plus(10, 7));
        //int + int
        //17

        System.out.println("-----");

        System.out.println(plus(3.2, 4));
        //double + int
        //7.2

        System.out.println("-----");

        System.out.println(plus(7, 1.223));
        //int + double
        //8.223

        System.out.println("-----");

        System.out.println(plus(5.08, 2.4));
        //double + double
        //7.48
    }

    private static int plus(int n1, int n2) {
        System.out.println("int + int");
        return n1 + n2;
    }

    private static double plus(int n1, double d1) {
        System.out.println("int + double");
        return n1 + d1;
    }

    private static double plus(double d1, int n1) {
        System.out.println("double + int");
        return n1 + d1;
    }

    private static double plus(double d1, double d2) {
        System.out.println("double + double");
        return d1 + d2;
    }
}
