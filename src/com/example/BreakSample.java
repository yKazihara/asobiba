package com.example;

public class BreakSample {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 0; i < 30; i++) {
            num *= 5;
            System.out.println(STR."num = \{num}");

            if (num > 10000){
                System.out.println("Over 10000");
                break;
            }
        }
        // num = 5
        // num = 25
        // num = 125
        // num = 625
        // num = 3125
        // num = 15625
        // Over 10000

        System.out.println("-----");

        Outer: // ラベル
        for (int i = 1; i < 5; i++){

            Inner:
            for (int j = 1; j < 5; j++){
                System.out.println(STR."i * j = \{i * j}");

                if (i * j > 10){
                    break Outer;
                }
            }

            System.out.println("Next");
        }

        System.out.println("End");
        // i * j = 1
        // i * j = 2
        // i * j = 3
        // i * j = 4
        // Next
        // i * j = 2
        // i * j = 4
        // i * j = 6
        // i * j = 8
        // Next
        // i * j = 3
        // i * j = 6
        // i * j = 9
        // i * j = 12
        // End
    }
}
