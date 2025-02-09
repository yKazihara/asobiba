package com.example;

public class StringBuilderLengthSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(STR."length:\{sb.length()}"); // length:0
        System.out.println(STR."capacity:\{sb.capacity()}"); // capacity:16

        System.out.println("-----");

        sb.append("Hello");
        System.out.println(sb); // Hello
        System.out.println(STR."length:\{sb.length()}"); // length:5
        System.out.println(STR."capacity:\{sb.capacity()}"); // capacity:16

        System.out.println("-----");

        sb.append("Java");
        System.out.println(sb); // HelloJava
        System.out.println(STR."length:\{sb.length()}"); // length:9
        System.out.println(STR."capacity:\{sb.capacity()}"); // capacity:16

        System.out.println("-----");

        sb.append(". Hello, Tarou.");
        System.out.println(sb); // HelloJava. Hello, Tarou.
        System.out.println(STR."length:\{sb.length()}"); // length:24
        System.out.println(STR."capacity:\{sb.capacity()}"); // capacity:34
    }
}
