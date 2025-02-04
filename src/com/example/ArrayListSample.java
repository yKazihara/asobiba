package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // インデックス指定なしで順番に追加
        list.add("Apple");
        list.add("Orange");

        for(String s: list){
            System.out.println(s);
        }
        //Apple
        //Orange

        System.out.println("-----");

        //  インデックスを指定して追加
        list.add(1, "Grapes");

        for(String s: list){
            System.out.println(s);
        }
        //Apple
        //Grapes ← 追加
        //Orange

        System.out.println("-----");

        // リストのサイズを取得
        System.out.println(list.size()); // 3

        System.out.println("-----");

        //  インデックスを指定して削除
        list.remove(0);

        for(String s: list){
            System.out.println(s);
        }
        //(Apple) ← 削除
        // Grapes
        //Orange

        System.out.println("-----");

        // リストのサイズを取得
        System.out.println(list.size()); // 2

        System.out.println("-----");

        // インデックスを指定して要素を取得
        System.out.println(list.get(0)); // Grapes

        System.out.println("-----");

        // インデックスを指定して値を置き換え
        list.set(1, "Banana");

        for(String s: list){
            System.out.println(s);
        }
        //Grapes
        //Banana

        System.out.println("-----");

        // すべて削除
        list.clear();

        // リストのサイズを取得
        System.out.println(list.size()); // 0

        System.out.println("-----");

        list.add("Apple");
        list.add("Orange");
        list.add("Lemon");
        list.add("Orange");

        // 要素を検索しインデックスを取得
        System.out.println(list.indexOf("Orange")); // 1
        System.out.println(list.lastIndexOf("Orange")); // 3
    }
}
