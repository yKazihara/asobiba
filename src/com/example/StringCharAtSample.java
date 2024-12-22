package com.example;

public class StringCharAtSample {
    public static void main(String[] args) {
        String msg = "東京都港区赤坂";

        for (int i = 0; i < msg.length(); i++){
            System.out.println(STR."\{i}；\{msg.charAt(i)}");
        }
        //0；東
        //1；京
        //2；都
        //3；港
        //4；区
        //5；赤
        //6；坂
    }
}
