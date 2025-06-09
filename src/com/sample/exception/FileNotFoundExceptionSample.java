package com.sample.exception;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundExceptionSample {
    public static void main(String[] args) {
        try {
            File file = new File("C:/XXXXXXXXXXXXXXXXXXXXXX");
            System.out.println(file.exists());
            FileInputStream is = new FileInputStream(file);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
            // java.io.FileNotFoundException: C:/XXXXXXXXXXXXXXXXXXXXXX (No such file or directory)
        }

        try {
            File file = new File("/tmp/sample.txt");
            System.out.println(file.exists());
            FileInputStream is = new FileInputStream(file);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
            // java.io.FileNotFoundException: /tmp/sample.txt (Permission denied)
        }
    }
}
