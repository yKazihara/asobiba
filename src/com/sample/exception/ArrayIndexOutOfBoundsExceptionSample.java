package com.sample.exception;

public class ArrayIndexOutOfBoundsExceptionSample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3 };

        for (int j : intArray) {
            System.out.println(j);
        }

        System.out.println("-----");

        try {
            System.out.println(intArray[0]);
            System.out.println(intArray[1]);
            System.out.println(intArray[2]);
            System.out.println(intArray[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //1
        //2
        //3
        //-----
        //1
        //2
        //3
        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    }
}
