package com.sample.exception;

public class NullPointer2 {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            // Personオブジェクトのnameフィールドの
            // 文字数を表示します。
            System.out.println(p.name.length());
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.NullPointerException: Cannot invoke "String.length()" because "p.name" is null
        }
    }
}
