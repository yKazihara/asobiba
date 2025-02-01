package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesListSample {
    public static void main(String[] args) {
        Path dirpath = Paths.get("src");

        try (Stream<Path> stream = Files.list(dirpath)) {
            stream.forEach(p -> System.out.println(p.toString()));
        } catch(IOException e) {
            System.out.println(e);
        }
        // 第一階層ディレクトリのみリスト表示
        //src/com

        System.out.println("-----");

        try (Stream<Path> stream = Files.walk(dirpath, 3)) {
            stream.forEach(p -> System.out.println(p.toString()));
        } catch(IOException e) {
            System.out.println(e);
        }
        // 第三階層ディレクトリまでリスト表示
        //src/com
        //src/com/example
        //src/com/example/RegexCanonEqSample.java
        //src/com/example/RegexUnixLinesSample.java
        //...
    }
}
