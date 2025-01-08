package com.example;

public class tryCatchFinallySample {
    public static void main(String[] args){
        display(1); // ほんとはゼロ始まりだけど間違ったシチュエーション
        display(2);
        display(3);
    }
    //29
    //要素の出力を終了します。
    //36
    //要素の出力を終了します。
    //配列の範囲を超えています。
    //要素の出力を終了します。

    private static void display(int index) {
        int[] array = {18, 29, 36};

        try {
            System.out.println(array[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        } finally {
            System.out.println("要素の出力を終了します。");
        }
    }
}
