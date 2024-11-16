package com.example;

public class OperatorPrecedenceSample {
    public static void main(String[] args) {
        int n1 = 10 * 5 + 4; // 10かける5が優先して計算されるよね。
        int n2 = 4 + 10 * 5; // 10かける5が優先して計算されるよね。

        System.out.println(STR."10 * 5 + 4 = \{n1}"); // 10 * 5 + 4 = 54
        System.out.println(STR."4 + 10 * 5 = \{n2}"); // 4 + 10 * 5 = 54

        int n = 10 - 5 - 3; // まず10から5を引いて、そのあと3が引かれるよね。

        System.out.println(STR."10 - 5 - 3 = \{n}"); // 10 - 5 - 3 = 2

        int n3 = 10 + 8 / 2 * 4; // 8割る2のあと4をかけて、最後に10を足す。
        int n4 = (10 + 8 / 2) * 4; // 8割る2のあと10をたして、最後に4をかける。
        int n5 = ((10 + 8) / 2) * 4; // 10足す8のあとに2で割って、最後に4をかける。

        System.out.println(STR."10 + 8 / 2 * 4 = \{n3}"); // 10 + 8 / 2 * 4 = 26
        System.out.println(STR."(10 + 8 / 2) * 4 = \{n4}"); // (10 + 8 / 2) * 4 = 56
        System.out.println(STR."((10 + 8) / 2) * 4 = \{n5}"); // ((10 + 8) / 2) * 4 = 36
    }
}
