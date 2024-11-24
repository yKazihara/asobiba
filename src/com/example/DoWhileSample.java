package com.example;

import java.util.Random;

public class DoWhileSample {
    public static void main(String[] args) {
        int num;
        Random rand = new Random();

        System.out.println("6が出たら終わりです");

        do {
            // 乱数を使って1〜6までの数値を取得し、もし6が出たら繰り返し処理を終了する
            num = rand.nextInt(6) + 1; // 0は省きたいから1を足している
            System.out.println(STR."no = \{num}");
        } while (num != 6);

        System.out.println("-----");

        num = 5;

        // whileの条件がbooleanの場合
        do {
            System.out.println(STR."num = \{num}"); // 5、3、1で終了
            num -= 2;

            if (num < 0){
                break;
            }
        } while (true);
    }
}
