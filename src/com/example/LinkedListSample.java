package com.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // インデックスを指定せずに追加
        list.add("東京都");
        list.add("大阪府");

        for(String s: list){
            System.out.println(s);
        }
        //東京都
        //大阪府

        System.out.println("-----");

        // インデックスを指定して追加
        list.add(1, "神奈川県");

        for(String s: list){
            System.out.println(s);
        }
        //東京都
        //神奈川県 ← 追加
        //大阪府

        System.out.println("-----");

        // インデックスを指定して要素を取得
        System.out.println(list.get(0)); // "東京都"
        System.out.println(list.get(2)); // "大阪府"

        System.out.println("-----");

        // インデックスを指定して削除
        list.remove(0);

        for(String s: list){
            System.out.println(s);
        }
        //(東京都) ← 削除
        //神奈川県
        //大阪府

        // リストのサイズを取得
        System.out.println(list.size()); // 2

        System.out.println("-----");

        // インデックスを指定して要素を置き換え
        list.set(1, "北海道");

        for(String s: list){
            System.out.println(s);
        }
        //神奈川県
        //北海道 ← 置き換えられた

        System.out.println("-----");

        // 要素をすべて削除
        list.clear();

        // リストのサイズを取得
        System.out.println(list.size()); // 0

        System.out.println("-----");

        list.add("東京都");
        list.add("大阪府");
        list.add("神奈川県");
        list.add("大阪府");

        // 要素を検索
        System.out.println(list.indexOf("大阪府")); // 1
        System.out.println(list.lastIndexOf("大阪府")); // 3
    }
}
