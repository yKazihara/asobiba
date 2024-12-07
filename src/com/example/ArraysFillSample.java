package com.example;

import java.util.Arrays;

public class ArraysFillSample {
    public static void main(String[] args) {
        int[] intArray = new int[3];

        // 初期値は0が設定されている
        System.out.println(intArray[0]); // 0
        System.out.println(intArray[1]); // 0
        System.out.println(intArray[2]); // 0

        // すべての要素に同じintの値を格納
        Arrays.fill(intArray, 10);

        System.out.println(intArray[0]); // 10
        System.out.println(intArray[1]); // 10
        System.out.println(intArray[2]); // 10

        System.out.println("-----");

        boolean[] booleanArray = new boolean[3];

        // 初期値はfalseが設定されている
        System.out.println(booleanArray[0]); // false
        System.out.println(booleanArray[1]); // false
        System.out.println(booleanArray[2]); // false

        // すべての要素に同じbooleanの値を格納
        Arrays.fill(booleanArray, true);

        System.out.println(booleanArray[0]); // true
        System.out.println(booleanArray[1]); // true
        System.out.println(booleanArray[2]); // true

        System.out.println("-----");

        String[] stringArray = new String[3];

        // 初期値はnullが設定されている
        System.out.println(stringArray[0]); // null
        System.out.println(stringArray[1]); // null
        System.out.println(stringArray[2]); // null

        // すべての要素に同じbooleanの値を格納
        Arrays.fill(stringArray, "foo");

        System.out.println(stringArray[0]); // foo
        System.out.println(stringArray[1]); // foo
        System.out.println(stringArray[2]); // foo
    }
}
