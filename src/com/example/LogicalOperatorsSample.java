package com.example;

public class LogicalOperatorsSample {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        System.out.println(STR."a < 0 && b > 5 : \{a < 0 && b > 5}"); // false
        System.out.println(STR."a < 5 && b > 3 : \{a < 5 && b > 3}"); // false
        System.out.println(STR."a < 9 && b > 7 : \{a < 9 && b > 7}"); // false
        System.out.println(STR."a < 9 && b > 3 : \{a < 9 && b > 3}"); // true

        System.out.println(STR."a < 0 || b > 5 : \{a < 0 || b > 5}"); // false
        System.out.println(STR."a < 5 || b > 3 : \{a < 5 || b > 3}"); // true
        System.out.println(STR."a < 9 || b > 7 : \{a < 9 || b > 7}"); // true
        System.out.println(STR."a < 9 || b > 3 : \{a < 9 || b > 3}"); // true

        System.out.println(STR."!(a > 0) : \{!(a > 0)}"); // false
        System.out.println(STR."!(a > 9) : \{!(a > 9)}"); // true
    }
}
