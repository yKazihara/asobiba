package com.sample.exception;

public class NullPointer {

    public static void main(String[] args) {
        try {
            String s = null;
            // sに具体的な文字列がセットされていない状態で、
            // sのメソッドを呼び出します。
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        }
    }
}
