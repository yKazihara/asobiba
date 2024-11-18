package com.example;

public class AssignmentOperatorsSample {
    public static void main(String[] args) {
        int num;

        num = 10;
        System.out.println(num); // 10
        num += 5;
        System.out.println(num); // 15

        num = 8;
        System.out.println(num); // 8
        num *= 4;
        System.out.println(num); // 32

        int a, b, c;

        a = b = c = 15;
        System.out.println(a); // 15
        System.out.println(b); // 15
        System.out.println(c); // 15
    }
}
