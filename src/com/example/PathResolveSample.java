package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveSample {
    public static void main(String[] args){
        Path p1 = Paths.get("C:/data/image");
        Path p2 = Paths.get("photo/profile.jpg");
        Path p3 = p1.resolve(p2);

        System.out.println(p1); // C:/data/image
        System.out.println(p2); // photo/profile.jpg
        System.out.println(p3); // C:/data/image/photo/profile.jpg

        System.out.println("-----");

        Path p4 = Paths.get("data/image/stone.jpg");
        Path p5 = Paths.get("grass.jpg");
        Path p6 = p4.resolveSibling(p5);

        System.out.println(p4); // data/image/stone.jpg
        System.out.println(p5); // grass.jpg
        System.out.println(p6); // data/image/grass.jpg
    }
}
