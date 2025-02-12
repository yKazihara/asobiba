package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadFromFileSample {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/example/file_read_demo/fileReadSample01.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String dat = scanner.next();
                System.out.println(dat);
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        //aiueo12345
        //あいうえお１２３４５
    }
}
