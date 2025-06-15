package com.sample.exception;

public class NegativeArraySizeExceptionSample {
    public static void main(String[] args) {
        try {
            int size = -1;
            int[] intArray = new int[size];
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.NegativeArraySizeException: -1
        }
    }
}
