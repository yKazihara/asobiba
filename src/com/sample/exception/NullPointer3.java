package com.sample.exception;

public class NullPointer3 {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            // 氏名がnullかどうかを確認します。
            if (p.name == null) {
                System.out.println("氏名がセットされていません");
            } else {
                // p.nameがnullではないので、
                // length メソッドを呼び出しても例外は発生しません。
                System.out.println(p.name.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
