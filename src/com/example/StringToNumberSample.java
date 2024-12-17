package com.example;

public class StringToNumberSample {
    public static void main(String[] args) {
        String si = "42";
        String sd = "2.84";
        String sb = "false";

        int i1 = Integer.parseInt(si);
        double d1 = Double.parseDouble(sd);
        boolean b1 = Boolean.parseBoolean(sb);

        int i2 = Integer.valueOf(si).intValue();
        double d2 = Double.valueOf(sd).doubleValue();
        boolean b2 = Boolean.valueOf(sb).booleanValue();

        System.out.println(i1); // 42
        System.out.println(d1); // 2.84
        System.out.println(b1); // false

        System.out.println(i2); // 42
        System.out.println(d2); // 2.84
        System.out.println(b2); // false
    }
}
