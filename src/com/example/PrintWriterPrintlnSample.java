package com.example;

import java.io.*;

public class PrintWriterPrintlnSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_write_demo/fileWriteSample03.txt");

            if (checkBeforeWritefile(file)) {
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

                pw.println("今日の最高気温は");
                pw.println(10);
                pw.println("度です");

                pw.close();
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        //今日の最高気温は
        //10
        //度です
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
