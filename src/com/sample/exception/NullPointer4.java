package com.sample.exception;

public class NullPointer4 {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            // 次の処理で、例外が発生する可能性があります。
            System.out.println(p.name.length());
        } catch (Exception e) {
            // 例外が発生した場合に、適切な対応をとります。
            // ここでは、ユーザ向けのわかりやすいメッセージを出力することとします。
            System.out.println("氏名の長さを表示する処理において、例外が発生しました。");
        }
        System.out.println("名前の処理が終了しました。");
    }
}
