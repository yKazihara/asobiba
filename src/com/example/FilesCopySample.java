package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCopySample {
    public static void main(String[] args) {
        Path p_base = Paths.get("src/com/example/file_copy_demo");
        Path p_from = Paths.get("src/com/example/file_copy_demo/from");
        Path p_to = Paths.get("src/com/example/file_copy_demo/to");
        Path p1 = Paths.get("src/com/example/file_copy_demo/from/file_from.txt");
        Path p2 = Paths.get("src/com/example/file_copy_demo/to/file_to.txt");
        Path p3 = Paths.get("src/com/example/file_copy_demo/from/dir_from");
        Path p4 = Paths.get("src/com/example/file_copy_demo/to/dir_to");

        // とりあえずファイルとディレクトリを作成。
        try {
            Files.createDirectory(p_base);
            Files.createDirectory(p_from);
            Files.createDirectory(p_to);
            Files.createFile(p1);
            Files.createDirectory(p3);
        } catch(IOException e) {
            System.out.println(e);
        }

        // ここからが本当の目的。
        try {
            Files.copy(p1, p2); // file_from.txt が file_to.txt としてコピーされる。
            Files.copy(p3, p4); // dir_from が dir_to としてコピーされる。
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
