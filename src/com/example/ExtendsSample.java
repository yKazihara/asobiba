package com.example;

public class ExtendsSample {
    public static void main(String[] args) {
        Soarer soarer = new Soarer();

        // 子クラスのメソッド実行
        soarer.openRoof();
        if (soarer.roofOpenFlag) {
            System.out.println("屋根が開いています");
        } else {
            System.out.println("屋根が閉じています");
        }
        // 屋根が開いています

        System.out.println("-----");

        // 親クラスのメソッド実行
        soarer.accele();
        System.out.println(STR."現在の速度は\{soarer.speed}キロです");
        // 現在の速度は5キロです
    }
}

class Car {
    int speed = 0;

    public void accele(){
        speed += 5;
    }

    public void brake(){
        speed -= 5;
    }
}

class Soarer extends Car {
    boolean roofOpenFlag = false;

    public void openRoof() {
        roofOpenFlag = true;
    }

    public void closeRoof() {
        roofOpenFlag = true;
    }
}
