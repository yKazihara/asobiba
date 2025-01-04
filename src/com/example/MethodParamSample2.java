package com.example;

public class MethodParamSample2 {
    public static void main(String[] args) {
        int num = 8;
        int[] array = {10, 4};
        String str = "hogehoge";

        System.out.println(STR."num = \{num}"); // 8
        System.out.println(STR."array[0] = \{array[0]}"); // array[0] = 10
        System.out.println(STR."str = \{str}"); // str = hogehoge
        System.out.println("-----");

        updateValue(num, array, str);

        System.out.println(STR."num = \{num}"); // num = 8 プリミティブだし変わらんよね
        System.out.println(STR."array[0] = \{array[0]}"); // array[0] = 12 配列は変わるよね
        System.out.println(STR."str = \{str}"); // str = hogehoge Stringは変わらんよね
    }

    private static void updateValue(int num, int[] array, String str){
        num = 5;
        array[0] = 12;
        str = "fugafuga";
    }
}
