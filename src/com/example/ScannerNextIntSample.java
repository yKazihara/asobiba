package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerNextIntSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("年齢を入力してください");
            int age = scanner.nextInt();

            System.out.println(STR."年齢は\{age}です");
        } catch (InputMismatchException e){
            System.out.println("数値を入力してください");
        }
        //年齢を入力してください
        //20
        //年齢は20です

        //年齢を入力してください
        //a
        //数値を入力してください
    }
}
