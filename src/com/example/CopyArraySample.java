package com.example;

import java.util.Arrays;

public class CopyArraySample {
    public static void main(String[] args) {
        int[] src1 = {12, 24, 18};
        int[] dst1 = src1; // 配列は参照型だからどっちも同じ配列を見ている状態

        System.out.println(STR."src1[0] = \{src1[0]}"); // 12
        System.out.println(STR."dst1[0] = \{dst1[0]}"); // 12

        src1[0] = 42; // なので値を書き換えると・・・

        // どちらも書き換わってしまう
        System.out.println(STR."src1[0] = \{src1[0]}"); // 42
        System.out.println(STR."dst1[0] = \{dst1[0]}"); // 42

        System.out.println("-- forで回して一個ずつコピー・・・ --");

        int[] src2 = {12, 24, 18};
        int[] dst2 = new int[3];

        for (int i = 0; i < src2.length; i++){
            dst2[i] = src2[i];
        }

        System.out.println(STR."src2[0] = \{src2[0]}"); // 12
        System.out.println(STR."dst2[0] = \{dst2[0]}"); // 12

        src2[0] = 42;

        System.out.println(STR."src2[0] = \{src2[0]}"); // 42
        System.out.println(STR."dst2[0] = \{dst2[0]}"); // 12

        System.out.println("-- Arrays.copyOfを使う --");

        int[] src3 = {12, 24, 18};
        int[] dst3 = Arrays.copyOf(src3, 3);

        System.out.println(STR."src3[0] = \{src3[0]}"); // 12
        System.out.println(STR."dst3[0] = \{dst3[0]}"); // 12

        src3[0] = 42;

        System.out.println(STR."src3[0] = \{src3[0]}"); // 42
        System.out.println(STR."dst3[0] = \{dst3[0]}"); // 12

        System.out.println("-- System.arraycopyを使う --");

        int[] src4 = {12, 24, 18};
        int[] dst4 = new int[3];

        System.arraycopy(src4, 0, dst4, 0, 3);

        System.out.println(STR."src4[0] = \{src4[0]}"); // 12
        System.out.println(STR."dst4[0] = \{dst4[0]}"); // 12

        src4[0] = 42;

        System.out.println(STR."src4[0] = \{src4[0]}"); // 42
        System.out.println(STR."dst4[0] = \{dst4[0]}"); // 12

        System.out.println("-- シャローコピー --");

        MyTest[] src5 = {new MyTest(28), new MyTest(12)};
        MyTest[] dst5 = new MyTest[2];

        for (int i = 0; i < src5.length; i++){
            dst5[i] = src5[i]; // ココ
        }

        System.out.println(STR."src5[0] = \{src5[0].num}"); // 28
        System.out.println(STR."dst5[0] = \{dst5[0].num}"); // 28

        src5[0].num = 41;

        // シャローコピーだから値が両方書き換わる
        System.out.println(STR."src5[0] = \{src5[0].num}"); // 41
        System.out.println(STR."dst5[0] = \{dst5[0].num}"); // 41

        System.out.println("-- ディープコピー --");

        MyTest[] src6 = {new MyTest(28), new MyTest(12)};
        MyTest[] dst6 = new MyTest[2];

        for (int i = 0; i < src6.length; i++){
            dst6[i] = new MyTest(src6[i].num); // ココ
        }

        System.out.println(STR."src6[0] = \{src6[0].num}"); // 28
        System.out.println(STR."dst6[0] = \{dst6[0].num}"); // 28

        src6[0].num = 41;

        System.out.println(STR."src6[0] = \{src6[0].num}"); // 41
        System.out.println(STR."dst6[0] = \{dst6[0].num}"); // 16
    }
}

class MyTest{
    public int num;

    public MyTest(int n){
        num = n;
    }
}
