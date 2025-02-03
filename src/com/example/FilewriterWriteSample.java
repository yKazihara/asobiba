package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterWriteSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_write_demo/fileWriteSample01.txt");

            if (checkBeforeWritefile(file)) {
                FileWriter filewriter = new FileWriter(file);

                filewriter.write("こんにちは\r\n");
                filewriter.write("お元気ですか\r\n");

                filewriter.close();
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        //こんにちは
        //お元気ですか
    }

    private static boolean checkBeforeWritefile(File file){
        if (file.exists()){
            if (file.isFile() && file.canWrite()){
                return true;
            }
        }
        return false;
    }
}
