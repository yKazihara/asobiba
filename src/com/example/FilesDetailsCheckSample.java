package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDetailsCheckSample {
    public static void main(String[] args) {
        Path p_base = Paths.get("src/com/example/file_check_demo");
        Path p1 = Paths.get("src/com/example/file_check_demo/demo01.txt");
        Path p2 = Paths.get("src/com/example/file_check_demo/demo02.txt");

        try {
            // とりあえずファイルとディレクトリを作成。
            Files.createDirectory(p_base);
            Files.createFile(p1);
            // p2は生成しない。

            // ここからが本当にやりたいこと。
            checkPathDetails(p_base);
            // file_check_demoはディレクトリです。
            System.out.println("-----");

            checkPathDetails(p1);
            //demo01.txtは存在するファイルです。
            //実行不可なファイルです。
            //隠しファイルではありません。
            //読み取り可能なファイルです。
            //書き込み可能なファイルです。
            //シンボリックリンクではありません。
            System.out.println("-----");

            checkPathDetails(p2);
            //demo02.txtは存在しないファイルです。
            //実行不可なファイルです。
            //隠しファイルではありません。
            //読み取り不可なファイルです。
            //書き込み不可なファイルです。
            //シンボリックリンクではありません。
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static void checkPathDetails(Path p) throws IOException {
        System.out.print(STR."\{p.getFileName()}は");

        if (Files.isDirectory(p)) {
            System.out.println("ディレクトリです。");
        } else {
            if (Files.exists(p)) {
                System.out.println("存在するファイルです。");
            } else {
                System.out.println("存在しないファイルです。");
            }

            if (Files.isExecutable(p)) {
                System.out.println("実行可能なファイルです。");
            } else {
                System.out.println("実行不可なファイルです。");
            }

            if (Files.isHidden(p)) {
                System.out.println("隠しファイルです。");
            } else {
                System.out.println("隠しファイルではありません。");
            }

            if (Files.isReadable(p)) {
                System.out.println("読み取り可能なファイルです。");
            } else {
                System.out.println("読み取り不可なファイルです。");
            }

            if (Files.isWritable(p)) {
                System.out.println("書き込み可能なファイルです。");
            } else {
                System.out.println("書き込み不可なファイルです。");
            }

            if (Files.isSymbolicLink(p)) {
                System.out.println("シンボリックリンクです。");
            } else {
                System.out.println("シンボリックリンクではありません。");
            }
        }
    }
}
