package com.example;

public class CombiningFixedAndVariableArgumentsSample {
    public static void main(String[] args) {
        disp("[", "]", 10, 7, 8);
        disp("【", "】", 128, 76);
    }
    //[10]
    //[7]
    //[8]
    //【128】
    //【76】

    // 可変引数は一つのメソッドで一つ、そして最後に記述するルールだって
    private static void disp(String sb, String sa, int... num) {
        for (int i = 0; i < num.length; i++){
            System.out.println(sb + num[i] + sa);
        }
    }
}
