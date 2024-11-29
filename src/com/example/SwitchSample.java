package com.example;

public class SwitchSample {
    public static void main(String[] args) {
        int[] classCodeArray = {1,3,2};
        String[] name = {"鈴木","本田","遠藤"};

        for (int i = 0; i < 3; i++){
            System.out.print(STR."\{name[i]}さんは");

            switch(classCodeArray[i]){
                case 1:
                    System.out.println("Aクラスです");
                    break;
                case 2:
                    System.out.println("Bクラスです");
                    break;
                case 3:
                    System.out.println("Cクラスです");
            }
        }
        // 鈴木さんはAクラスです
        // 本田さんはCクラスです
        // 遠藤さんはBクラスです

        System.out.println("-----");
        int num = 2;

        switch(num){
            case 5:
                System.out.println("一等賞");
                break;
            case 2:
                System.out.println("二等賞");
                break;
            default:
                System.out.println("残念賞");
        }
        // 二等賞

        System.out.println("-----");

        switch(num){
            case 1:
            case 3:
            case 5:
                System.out.println("大当たり");
                break;
            case 2:
            case 4:
                System.out.println("残念賞");
        }
        // 残念賞
    }
}
