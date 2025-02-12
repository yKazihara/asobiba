package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerUseDelimiterSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Apple,Orange,Lemon");
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            String fruit = scanner.next();
            System.out.println(fruit);
        }
        //Apple
        //Orange
        //Lemon

        System.out.println("-----");

        String regex = ":|;";
        Pattern p = Pattern.compile(regex);

        scanner = new Scanner("Melon:Peach;Grapes:Orange");
        scanner.useDelimiter(p);

        while (scanner.hasNext()){
            String fruit = scanner.next();
            System.out.println(fruit);
        }
        //Melon
        //Peach
        //Grapes
        //Orange
    }
}
