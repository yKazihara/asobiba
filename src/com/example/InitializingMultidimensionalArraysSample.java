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
    }
}
