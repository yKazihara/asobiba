package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalizeSample {
    public static void main(String[] args){
        Path p1 = Paths.get("./doc/report.txt");
        Path p2 = Paths.get("C:/document/doc/../pdf");

        System.out.println(STR."\{p1} -> \{p1.normalize()}");
        // ./doc/report.txt -> doc/report.txt

        System.out.println(STR."\{p2} -> \{p2.normalize()}");
        // C:/document/doc/../pdf -> C:/document/pdf
    }
}
