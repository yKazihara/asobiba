package com.example;

public class Dentaku {
    public static void main(String[] args){
        Dentaku dentaku = new Dentaku();
        dentaku.plus(10,5); // plus = 15
        dentaku.minus(9,2); // minus = 7
    }

    void plus(int val1, int val2){
        int result = val1 + val2;
        // 初めて使うString Template！
        System.out.println(STR."plus = \{result}");
    }

    void minus(int val1, int val2){
        int result =  val1 - val2;
        // 初めて使うString Template！
        System.out.println(STR."minus = \{result}");
    }
}
