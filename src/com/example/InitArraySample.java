package com.example;

public class InitArraySample {
    public static void main(String[] args) {
        int[] intArray = new int[1];
        System.out.println(STR."int : \{intArray[0]}"); // int : 0

        long[] longArray = new long[1];
        System.out.println(STR."long : \{longArray[0]}"); // long : 0

        double[] doubleArray = new double[1];
        System.out.println(STR."double ; \{doubleArray[0]}"); // double ; 0.0

        boolean[] booleanArray = new boolean[1];
        System.out.println(STR."boolean : \{booleanArray[0]}"); // boolean : false

        String[] stringArray = new String[1];
        System.out.println(STR."String : \{stringArray[0]}"); // String : null

        System.out.println("-----");

        String[] fruitArray = {"Apple", "Orange", "Melon"};

        for (int i = 0; i < 3; i++){
            System.out.println(fruitArray[i]);
        }
    }
}
