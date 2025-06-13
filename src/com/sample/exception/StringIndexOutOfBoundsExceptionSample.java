package com.sample.exception;

public class StringIndexOutOfBoundsExceptionSample {
    public static void main(String[] args) {
        try {
            String s = "java";
            System.out.println(s.charAt(4));
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
        }
    }
}
