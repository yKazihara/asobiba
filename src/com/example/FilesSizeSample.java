package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesSizeSample {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/com/example");

        try (Stream<Path> stream = Files.list(p1)){
            stream.forEach(p -> {
                try {
                    System.out.print(STR."\{p.getFileName()} : ");
                    System.out.println(STR."\{Files.size(p)} byte");
                } catch(IOException e) {
                    System.out.println(e);
                }
            });
        } catch(IOException e) {
            System.out.println(e);
        }
        //RegexCanonEqSample.java : 788 byte
        //RegexUnixLinesSample.java : 1522 byte
        //ArraysEqualsSample.java : 3141 byte
        //MethodParamSample1.java : 821 byte
        //・・・
    }
}
