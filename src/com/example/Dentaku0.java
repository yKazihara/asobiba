package com.example;

public class Dentaku0 {
    public static void main(String[] args) {
        Dentaku0 dentaku = new Dentaku0();
        dentaku.plus(10,5); // plus = 15
        dentaku.minus(9,2); // minus = 7
    }

    void plus(int val1, int val2) {
        int result = val1 + val2;
        // 初めて使うString Template！
        System.out.println(STR."plus = \{result}");
    }

    void minus(int val1, int val2) {
        int result =  val1 - val2;
        // 初めて使うString Template！
        System.out.println(STR."minus = \{result}");
    }
}
