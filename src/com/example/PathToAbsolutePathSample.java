package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToAbsolutePathSample {
    public static void main(String[] args){
        Path p1 = Paths.get("C:/code/java/file/report.txt");
        Path p2 = Paths.get("report.txt");
        Path p3 = p2.toAbsolutePath();

        System.out.println(p1); // C:/code/java/file/report.txt
        System.out.println(p2); // report.txt
        System.out.println(p3); // 例：// /Users/hoge/IdeaProjects/asobiba/report.txt

        System.out.println("-----");

        Path p4 = Paths.get("report.txt");
        Path p5 = Paths.get("/Users/hoge/IdeaProjects/asobiba/report.txt");

        System.out.println(p4.isAbsolute()); // false
        System.out.println(p5.isAbsolute()); // true
    }
}
