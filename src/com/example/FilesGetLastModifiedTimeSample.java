package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FilesGetLastModifiedTimeSample {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/com/example/FilesGetLastModifiedTimeSample.java");

        try {
            FileTime fileTime = Files.getLastModifiedTime(p1);
            Instant instant = fileTime.toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

            System.out.println(localDateTime);
            // 例：2025-01-31T16:19:10.213994217
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("-----");

        Path p2 = Paths.get("src/com/example/FilesGetLastModifiedTimeSample.java");

        try {
            FileTime fileTime = FileTime.from(Instant.now());
            Files.setLastModifiedTime(p2, fileTime);

            Instant instant = fileTime.toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println(localDateTime);
            // 例：2025-01-31T16:22:38.773121
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
