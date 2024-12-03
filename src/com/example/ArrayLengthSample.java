package com.example;

public class ArrayLengthSample {
    public static void main(String[] args) {
        double[] num = new double[3];

        num[0] = 5.24;
        num[1] = 8.0;
        num[2] = 12.375;

        int numArrayLength = num.length;
        System.out.println(STR."numArrayLength = \{numArrayLength}"); // numArrayLength = 3

        for (int i = 0; i < numArrayLength; i++){
            System.out.println(STR."num[\{i}] = \{num[i]}");
        }
    }
}
