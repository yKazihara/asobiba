package com.sample.exception;

public class NullPointer5 {
    public static void main(String[] args) {
        // 具体的な名前を指定して、Person2オブジェクトを作成。
        Person2 p1 = new Person2("Saitou");
        System.out.println(p1.getName().length());
        // 6

        // 名前を指定せず、Person2オブジェクトを作成。
        Person2 p2 = new Person2();
        System.out.println(p2.getName().length());
        // 0
    }
}
