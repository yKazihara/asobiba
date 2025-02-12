package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerHasNextSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("a i ue o 1 23 4 5");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        //a
        //i
        //ue
        //o
        //1
        //23
        //4
        //5

        System.out.println("-----");

        String regex = "[A-Z0-9]{2}";
        Pattern p = Pattern.compile(regex);

        scanner = new Scanner("AB 7B A5 AA aa BB");

        // パターンにマッチするものだけ出力し、マッチしないものに遭遇したら終わり
        while (scanner.hasNext(p)){
            System.out.println(scanner.next());
        }
        //AB
        //7B
        //A5
        //AA
    }
}
