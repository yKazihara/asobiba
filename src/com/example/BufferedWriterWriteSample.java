package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWriteSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_write_demo/fileWriteSample02.txt");

            if (checkBeforeWritefile(file)) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                bw.write("こんにちは");
                bw.newLine();
                bw.write("お元気ですか？");
                bw.newLine();

                bw.close();
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        //こんにちは
        //お元気ですか？
    }

    private static boolean checkBeforeWritefile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canWrite()) {
                return true;
            }
        }
        return false;
    }
}
