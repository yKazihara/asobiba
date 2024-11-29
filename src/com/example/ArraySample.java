package com.example;

public class ArraySample {
    public static void main(String[] args) {
        int[] result = new int[3];

        result[0] = 75;
        result[1] = 88;
        result[2] = 82;

        for (int i = 0 ; i < 3 ; i++){
            System.out.println(result[i]);
        }
        // 75
        // 88
        // 82

        System.out.println("-----");
        int[] data = new int[3];

        data[0] = 10;
        data[1] = 16;
        data[2] = 9;

        int[] other;
        other = data; // otherはdataを参照するようになる

        System.out.println(data[1]); // 16
        System.out.println(other[1]); // 16

        System.out.println("-----");
        var dataArray = new int[5]; // 型推論。int[] data = new int[5]と同じ。
    }
}
