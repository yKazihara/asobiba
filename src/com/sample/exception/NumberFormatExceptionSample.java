package com.sample.exception;

public class NumberFormatExceptionSample {
    public static void main(String[] args) {
        int i;
        try {
            i = Integer.parseInt("a");
            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.NumberFormatException: For input string: "a"
        }

        try {
            i = Integer.parseInt("a", 16);
            System.out.println(i);
            // 10

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
