package com.example;

public class StringEqualsSample {
    public static void main(String[] args) {

        // int同士の比較
        int num1 = 10;
        int num2 = 10;

        System.out.println(num1 == num2); // true

        System.out.println("-----");

        // 同じ文字でも参照しているオブジェクトが違う
        String msg1 = "Hello";
        String msg2 = new String(msg1);

        System.out.println(msg1 == msg2); // false

        System.out.println("-----");

        // 同じオブジェクトを参照している
        String msg3 = "Hello";
        String msg4 = msg3;

        System.out.println(msg3 == msg4); // true

        System.out.println("-----");

        String msg5 = "Hello";
        String msg6 = new String(msg5);

        System.out.println(msg5.equals(msg6)); // true

        System.out.println("-----");

        // 同じ値でも参照しているオブジェクトが違う
        int[] num3 = {1, 2, 3};
        int[] num4 = {1, 2, 3};

        System.out.println(num3 == num4); // false

        System.out.println("-----");

        // 文字列の場合同じ文字列リテラルを変数に格納すると、
        // 異なるオブジェクトをそれぞれ作成するのではなく同じオブジェクトへの参照を変数に格納するんだって
        String msg7 = "Hello";
        String msg8 = "Hello";

        System.out.println(msg7 == msg8); // true

        System.out.println("-----");

        char[] c = {'A', 'B', 'C'};
        String msg9 = new String(c);
        String msg10 = new String(c);

        System.out.println(msg9 == msg10); // false
        System.out.println(msg9.equals(msg10)); // true

        // 文字の比較に==は使わないほうがいいよね、って話
    }
}
