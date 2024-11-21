package com.example;

public class StringConcatenationSample {
    public static void main(String[] args) {
        System.out.println(45 + 18 + "point"); // 63point
        System.out.println("point" + 45 + 18); // point4518
        System.out.println("point" + (45 + 18)); // point63

        StringBuilder sb = new StringBuilder();
        sb.append("XT");
        sb.append(3140);
        sb.append("-Y2");

        String name = sb.toString();
        System.out.println(name); // XT3140-Y2
    }
}
