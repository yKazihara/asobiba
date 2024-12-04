package com.example;

public class MultidimensionalArraysSample {
    public static void main(String[] args) {
        int[][] num1 = new int[2][];

        num1[0] = new int[3];
        num1[0][0] = 78;
        num1[0][1] = 64;
        num1[0][2] = 59;

        num1[1] = new int[3];
        num1[1][0] = 58;
        num1[1][1] = 92;
        num1[1][2] = 82;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(STR."num1[\{i}][\{j}] = \{num1[i][j]}");
            }
        }
        //num1[0][0] = 78
        //num1[0][1] = 64
        //num1[0][2] = 59
        //num1[1][0] = 58
        //num1[1][1] = 92
        //num1[1][2] = 82

        System.out.println("-----");

        int[][] num2 = new int[2][3];

        num2[0][0] = 87;
        num2[0][1] = 58;
        num2[0][2] = 72;

        num2[1][0] = 74;
        num2[1][1] = 92;
        num2[1][2] = 80;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(STR."num2[\{i}][\{j}] = \{num2[i][j]}");
            }
        }
        //num2[0][0] = 87
        //num2[0][1] = 58
        //num2[0][2] = 72
        //num2[1][0] = 74
        //num2[1][1] = 92
        //num2[1][2] = 80

        System.out.println("-----");

        // 型推論使うとこうらしい。
        var num3 = new int[2][3];
    }
}
