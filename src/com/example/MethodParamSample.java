package com.example;

public class MethodParamSample {
    public static void main(String[] args) {
        int num1, num2;

        num1 = 10;
        num2 = 8;
        calcAndPrint(num1, num2);

        num1 = 23;
        calcAndPrint(num1, 7);

        calcAndPrint(15, 22);
    }

    private static void calcAndPrint(int n1, int n2) {
        System.out.println(STR."num1 = \{n1}, num2 = \{n2}");
        System.out.println(STR."num1 + num2 = \{n1 + n2}");
        System.out.println(STR."num1 - num2 = \{n1 - n2}");
        System.out.println("-----");
    }

    //num1 = 10, num2 = 8
    //num1 + num2 = 18
    //num1 - num2 = 2
    //-----
    //num1 = 23, num2 = 7
    //num1 + num2 = 30
    //num1 - num2 = 16
    //-----
    //num1 = 15, num2 = 22
    //num1 + num2 = 37
    //num1 - num2 = -7
    //-----
}
