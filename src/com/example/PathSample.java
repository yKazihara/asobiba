package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {
    public static void main(String[] args){
        Path p1 = Paths.get("C:\\code\\java\\file\\report.txt");
        Path p2 = Paths.get("C:", "code", "java", "file", "report.txt");
        Path p3 = Paths.get("C:/code/java/file/report.txt");
        Path p4 = Paths.get("C:/code/java/file/");
        Path p5 = Paths.get("C:/code/java/file");

        System.out.println(p1); // C:\code\java\file\report.txt
        System.out.println(p2); // C:/code/java/file/report.txt
        System.out.println(p3); // C:/code/java/file/report.txt
        System.out.println(p4); // C:/code/java/file
        System.out.println(p5); // C:/code/java/file

        System.out.println("-----");

        // Java11以降
        Path p6 = Path.of("C:\\code\\java\\file\\report.txt");
        Path p7 = Path.of("C:", "code", "java", "file", "report.txt");
        Path p8 = Path.of("C:/code/java/file/report.txt");

        System.out.println(p6); // C:\code\java\file\report.txt
        System.out.println(p7); // C:/code/java/file/report.txt
        System.out.println(p8); // C:/code/java/file/report.txt
    }
}
