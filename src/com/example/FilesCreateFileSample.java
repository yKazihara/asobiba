package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateFileSample {
    public static void main(String[] args) {
        Path p = Paths.get("src/com/example/sample01.txt");
        System.out.println(p.toAbsolutePath());
        // /Users/hogehoge/IdeaProjects/asobiba/src/com/example/sample01.txt

        try {
            Files.createFile(p);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
