package com.example;

public class VariableArgumentsSample {
    public static void main(String[] args) {
        System.out.println(sum(4, 10)); // 14
        System.out.println(sum(7, 2, 8)); // 17
        System.out.println(sum()); // 0 引数なしでもいけるのね
    }

    private static int sum(int... nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
