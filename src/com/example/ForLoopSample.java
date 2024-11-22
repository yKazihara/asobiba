package com.example;

public class ForLoopSample {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println(STR."合計=\{sum}"); // 合計=15

        System.out.println("-----");

        for (int i = 1; i < 3; i++){
            for (int j = 1; j < 3; j++){
                for (int k = 1; k < 3; k++){
                    System.out.println(STR."i = \{i}, j = \{j}, k = \{k}");
                }
            }
        }
    }
}
