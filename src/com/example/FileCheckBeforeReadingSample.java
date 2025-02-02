package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCheckBeforeReadingSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_read_demo/fileReadSample01.txt");

            if (checkBeforeReadfile(file)) {
                FileReader filereader = new FileReader(file);

                int ch;
                while ((ch = filereader.read()) != -1) {
                    System.out.print((char)ch);
                }

                filereader.close();
            } else {
                System.out.println("ファイルが見つからないか開けません");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        //aiueo12345
        //あいうえお１２３４５
    }

    private static boolean checkBeforeReadfile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }
}
