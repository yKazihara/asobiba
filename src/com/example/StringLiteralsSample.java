package com.example;

public class StringLiteralsSample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("こんにちは");

        System.out.println("-----");

        String msg1 = "Hello";

        char[] c = {'B', 'y', 'e'};
        String msg2 = new String(c);

        String msg3 = new String(msg1);

        System.out.println(msg1); // Hello
        System.out.println(msg2); // Bye
        System.out.println(msg3); // Hello

        msg2 = "Bye!";

        System.out.println(msg2); // Bye!
    }
}
