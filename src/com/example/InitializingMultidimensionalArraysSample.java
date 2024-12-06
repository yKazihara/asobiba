package com.example;

public class InitializingMultidimensionalArraysSample {
    public static void main(String[] args) {
        // オーソドックスな初期化、ってかこれしかないか。
        int[][] num1 = {{87,54,67}, {76,92,48}};

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(STR."num1[\{i}][\{j}] = \{num1[i][j]}");
            }
        }
        //num1[0][0] = 87
        //num1[0][1] = 54
        //num1[0][2] = 67
        //num1[1][0] = 76
        //num1[1][1] = 92
        //num1[1][2] = 48

        System.out.println("-----");

        // 多次元配列の長さを取得する
        System.out.println(num1.length); // 2
        System.out.println(num1[0].length); // 3
        System.out.println(num1[1].length); // 3

        System.out.println("-----");

        int[][] num2 = {{87,54}, {76,92,48,58,84}};

        for (int i = 0; i < num2.length; i++){
            for (int j = 0; j < num2[i].length; j++){
                System.out.println(STR."num2[\{i}][\{j}] = \{num2[i][j]}");
            }
        }
        //num2[0][0] = 87
        //num2[0][1] = 54
        //num2[1][0] = 76
        //num2[1][1] = 92
        //num2[1][2] = 48
        //num2[1][3] = 58
        //num2[1][4] = 84
    }
}
