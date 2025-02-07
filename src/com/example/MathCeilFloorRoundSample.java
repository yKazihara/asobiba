package com.example;

public class MathCeilFloorRoundSample {
    public static void main(String[] args) {
        // 切り上げ
        System.out.println(STR."Math.ceil(1.34) = \{Math.ceil(1.34)}"); // Math.ceil(1.34) = 2.0
        System.out.println(STR."Math.ceil(-0.23) = \{Math.ceil(-0.23)}"); // Math.ceil(-0.23) = -0.0
        System.out.println(STR."Math.ceil(3.89) = \{Math.ceil(-3.89)}"); // Math.ceil(3.89) = -3.0

        System.out.println("-----");

        // 切り捨て
        System.out.println(STR."Math.floor(1.34) = \{Math.floor(1.34)}"); // Math.floor(1.34) = 1.0
        System.out.println(STR."Math.floor(-0.23) = \{Math.floor(-0.23)}"); // Math.floor(-0.23) = -1.0
        System.out.println(STR."Math.floor(-3.89) = \{Math.floor(-3.89)}"); // Math.floor(-3.89) = -4.0

        System.out.println("-----");

        // 四捨五入
        System.out.println(STR."Math.round(4.49) = \{Math.round(4.49)}"); // Math.round(4.49) = 4
        System.out.println(STR."Math.round(4.5) = \{Math.round(4.5)}"); // Math.round(4.5) = 5
    }
}
