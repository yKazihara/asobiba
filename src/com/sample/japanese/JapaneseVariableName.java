package com.sample.japanese;

public class JapaneseVariableName {
    public static void main(String[] args) {
        人 太郎 = new 人();
        太郎.名前 = "太郎";
        太郎.ご挨拶();
    }
}

class 人 {
    String 名前;
    void ご挨拶() {
        System.out.println(STR."私の名前は\{名前}です。");
        // 私の名前は太郎です。
    }
}
