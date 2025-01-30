package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateDirectorySample {
    public static void main(String[] args) {
        Path p = Paths.get("src/com/example/sampleDir01");
        System.out.println(p.toAbsolutePath());
        // /Users/hogehoge/IdeaProjects/asobiba/src/com/example/sampleDir01

        try {
            Files.createDirectory(p);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
