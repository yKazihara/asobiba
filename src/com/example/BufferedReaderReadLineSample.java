package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderReadLineSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_read_demo/fileReadSample01.txt");

            if (checkBeforeReadfile(file)) {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String str;
                while((str = br.readLine()) != null){
                    System.out.println(str);
                }

                br.close();
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
            if (file.isFile() && file.canRead()){
                return true;
            }
        }
        return false;
    }
}
