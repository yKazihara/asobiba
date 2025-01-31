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
            // 例：2025-01-31T17:20:08.287500542
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("-----");

        try {
            FileTime fileTime = FileTime.from(Instant.now());
            Files.setLastModifiedTime(p1, fileTime); // 最終更新日時を更新

            Instant instant = fileTime.toInstant();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println(localDateTime);
            // 例：2025-01-31T17:20:10.145510
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
