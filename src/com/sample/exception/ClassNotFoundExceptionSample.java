package com.sample.exception;

public class ClassNotFoundExceptionSample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
        }
    }
}
