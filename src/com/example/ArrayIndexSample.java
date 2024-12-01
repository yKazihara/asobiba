package com.example;

public class ArrayIndexSample {
    public static void main(String[] args) {
        int[] num = new int[4];

        num[0] = 10;
        num[1] = 8;
        num[2] = 16;
        num[3] = 5;

        int numArraySize = num.length;
        for (int i = 0; i < numArraySize; i++){
            System.out.println(STR."num[\{i}] = \{num[i]}");
        }
    }
}
