package com.example;

import java.util.Arrays;

public class ArraysSortAscAndDescSample {
    public static void main(String[] args) {

        System.out.println("--まずは配列を逆に入れ替えるサンプル--");
        int[] src1 = {12, 24, 18, 31, 17};
        System.out.println(Arrays.toString(src1)); // [12, 24, 18, 31, 17]

        for (int f = 0, l = src1.length - 1; f < l; f++, l--) {
            int temp = src1[f];
            src1[f]  = src1[l];
            src1[l] = temp;
        }

        System.out.println(Arrays.toString(src1)); // [17, 31, 18, 24, 12]

        System.out.println("--昇順ソート--");

        int[] src2 = {12, 24, 18, 35, 21};
        System.out.println(Arrays.toString(src2));  // [12, 24, 18, 35, 21]

        Arrays.sort(src2);
        System.out.println(Arrays.toString(src2));  // [12, 18, 21, 24, 35]

        System.out.println("--降順ソート--");

        int[] src3 = {12, 24, 18, 35, 21};
        System.out.println(Arrays.toString(src3));  // [12, 24, 18, 35, 21]

        // 一旦昇順ソート
        Arrays.sort(src3);

        // 配列を逆に入れ替える
        for (int f = 0, l = src3.length - 1; f < l; f++, l--){
            int temp = src3[f];
            src3[f]  = src3[l];
            src3[l] = temp;
        }

        System.out.println(Arrays.toString(src3));  // [35, 24, 21, 18, 12]
    }
}
