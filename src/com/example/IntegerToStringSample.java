package com.example;

public class IntegerToStringSample {
    public static void main(String[] args) {
        int i = 10;
        short s = 21;
        long l = 12L;
        double d = 7.82;
        boolean b = true;

        String si1 = Integer.valueOf(i).toString();
        String ss1 = String.valueOf(s);
        String sl1 = Long.valueOf(l).toString();
        String sd1 = Double.valueOf(d).toString();
        String sb1 = Boolean.valueOf(b).toString();

        System.out.println(si1); // 10
        System.out.println(ss1); // 21
        System.out.println(sl1); // 12
        System.out.println(sd1); // 7.82
        System.out.println(sb1); // true

        System.out.println("-----");

        // 空文字 "" を + 演算子で連結することで数値を文字列に変換
        String si2 = "" + i;
        String sl2 = "" + l;
        String sd2 = "" + d;
        String sb2 = "" + b;

        System.out.println(si2); // 10
        System.out.println(sl2); // 12
        System.out.println(sd2); // 7.82
        System.out.println(sb2); // true
    }
}
