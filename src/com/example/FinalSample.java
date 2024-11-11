package com.example;

public class FinalSample {
    public static void main(String[] args) {
        final float TAX = 0.1F;

        float price = 800 * (1 + TAX);
        System.out.println(STR."料金は\{price}です"); // 料金は880.0です
    }
}
