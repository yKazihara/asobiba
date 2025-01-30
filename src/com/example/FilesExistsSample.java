package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FilesExistsSample {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/com/example/sample01.txt");
        Path p2 = Paths.get("src/com/example");
        Path p3 = Paths.get("src/com/example/sample02.txt");

        checkFile(p1); // 名前:sample01.txtは存在します。
        checkFile(p2); // 名前:exampleは存在します。
        checkFile(p3); // 名前:sample02.txtは存在しません。
    }

    private static void checkFile(Path p){
        System.out.print(STR."名前:\{p.getFileName()}は");

        if (Files.exists(p)) {
            System.out.println("存在します。");
        } else {
            System.out.println("存在しません。");
        }
    }
}
