package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDeleteSample {
    public static void main(String[] args) {
        Path p = Paths.get("src/com/example/sample02.txt");
        System.out.println(p.toAbsolutePath());

        try {
            Files.createFile(p);
            System.out.println("ファイルが作成されました。");

            Files.deleteIfExists(p);
            System.out.println("ファイルが削除されました。");
        } catch(IOException e) {
            System.out.println(e);
        }
        ///Users/hogehoge/IdeaProjects/asobiba/src/com/example/sample02.txt
        //ファイルが作成されました。
        //ファイルが削除されました。
    }
}
