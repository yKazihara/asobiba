package com.example;

public class forEachSample {
    public static void main(String[] args) {
        String[] prefArray = {"北海道", "東京都", "神奈川県"};

        for (String pref: prefArray){
            System.out.println(pref);
        }
    }
}
