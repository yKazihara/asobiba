package com.example;

public class StringTrimStripSample {
    public static void main(String[] args) {
        String msg1 = " AB CD ";
        String msg2 = "\tAB CD\n";
        String msg3 = "　AB CD　";

        System.out.println(STR."[\{msg1}]");        // [ AB CD ]
        System.out.println(STR."[\{msg1.trim()}]"); // [AB CD]
        System.out.println(STR."[\{msg2}]");        // [	AB CD(実際は改行表示される)]
        System.out.println(STR."[\{msg2.trim()}]"); // [AB CD] -> タブや改行は除去
        System.out.println(STR."[\{msg3}]");        // [　AB CD　]
        System.out.println(STR."[\{msg3.trim()}]"); // [　AB CD　] -> 全角スペースは除去されない

        System.out.println("-----");

        String msg = "　AB CD　"; // 前後が全角スペース

        System.out.println(STR."[\{msg}]");                 // [　AB CD　]
        System.out.println(STR."[\{msg.strip()}]");         // [AB CD]
        System.out.println(STR."[\{msg.stripLeading()}]");  // [AB CD　] -> 先頭スペースを除去
        System.out.println(STR."[\{msg.stripTrailing()}]"); // [　AB CD] -> 末尾スペースを除去
    }
}
