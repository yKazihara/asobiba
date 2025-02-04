package com.example;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // キーと値をセットで追加
        map.put("リンゴ", 80);
        map.put("オレンジ", 120);
        map.put("ブドウ", 90);

        // キーで値を取得
        System.out.println(STR."ブドウ：\{map.get("ブドウ")}"); // ブドウ：90
        System.out.println(STR."リンゴ：\{map.get("リンゴ")}"); // リンゴ：80

        System.out.println("-----");

        System.out.println(map.get("リンゴ")); // 80

        // キーを指定して値を書き換え
        map.put("リンゴ", 140);
        System.out.println(map.get("リンゴ")); // 140

        System.out.println("-----");

        // 存在しないキーで値を取得した場合
        System.out.println(map.get("バナナ")); // null

        // キーが存在しないときだけ追加
        map.putIfAbsent("バナナ", 120);
        System.out.println(map.get("バナナ")); // 120
        map.putIfAbsent("バナナ", 150);
        System.out.println(map.get("バナナ")); // 120のまま

        System.out.println("-----");

        // キーと値のペアの数を取得
        System.out.println(map.size());  // 4

        System.out.println("-----");

        // キーが存在しない場合に指定した値を返す
        System.out.println(map.get("メロン")); // null
        System.out.println(map.getOrDefault("メロン", 0)); // 0

        System.out.println("-----");

        // すべて削除
        map.clear();
        System.out.println(map.size()); // 0

        System.out.println("-----");

        map.put("リンゴ",80);
        map.put("オレンジ",120);
        map.put("ブドウ",90);

        System.out.println(map.size()); // 3

        map.remove("オレンジ");
        System.out.println(map.size()); // 2

        System.out.println("-----");

        // キーや値が存在するか確認
        System.out.println(map.containsKey("ブドウ"));  // true
        System.out.println(map.containsValue(100));  // false
    }
}
