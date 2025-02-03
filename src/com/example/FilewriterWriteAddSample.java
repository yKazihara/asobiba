package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterWriteAddSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_write_demo/fileWriteSample01.txt");

            if (checkBeforeWritefile(file)){
                // 第2引数にtrueを設定すると追加書き込み
                FileWriter filewriter = new FileWriter(file, true);

                filewriter.write("はい。元気です\r\n");
                filewriter.write("ではまた\r\n");

                filewriter.close();
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        //こんにちは
        //お元気ですか
        //はい。元気です
        //ではまた
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
