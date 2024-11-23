package com.example;

public class WhileLoopSample {
    public static void main(String[] args){
        int num = 1;

        // num = 1 から2、4、8、16、32、64と表示される。
        while (num < 100){
            System.out.println(STR."num = \{num}");
            num *= 2;
        }

        System.out.println("-----");

        // breakするパターンね
        num = 1;

        // num = 1 から2、4、8と表示される。
        while (true) {
            System.out.println(STR."num = \{num}");
            num *= 2;

            if (num > 10) {
                break;
            }
        }
    }
}
