package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathGetCurrentDirSample {
    public static void main(String[] args) {
        Path p1 = Paths.get("");
        Path p2 = p1.toAbsolutePath();

        System.out.println(p2.toString());
        // /Users/hogehoge/IdeaProjects/asobiba

        System.out.println("-----");

        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        // /Users/hogehoge/IdeaProjects/asobiba
    }
}
