package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathGetElementsSample {
    public static void main(String[] args){
        Path p1 = Paths.get("/Users/hoge/IdeaProjects/asobiba/report.txt");
        Path p2 = Paths.get("/Users/image/picture");
        Path p3 = Paths.get("file/backup.bat");
        Path p4 = Paths.get("profile.jpg");
        Path p5 = Paths.get("/Users/");

        dispPathInfo(p1);
        //Path:/Users/hoge/IdeaProjects/asobiba/report.txt
        //Name:report.txt
        //Parent Directory:/Users/hoge/IdeaProjects/asobiba
        //Root Component:/
        //Name Count:5
        //[Users][hoge][IdeaProjects][asobiba][report.txt]

        dispPathInfo(p2);
        //Path:/Users/image/picture
        //Name:picture
        //Parent Directory:/Users/image
        //Root Component:/
        //Name Count:3
        //[Users][image][picture]

        dispPathInfo(p3);
        //Path:file/backup.bat
        //Name:backup.bat
        //Parent Directory:file
        //Root Component:null
        //Name Count:2
        //[file][backup.bat]

        dispPathInfo(p4);
        //Path:profile.jpg
        //Name:profile.jpg
        //Parent Directory:null
        //Root Component:null
        //Name Count:1
        //[profile.jpg]

        dispPathInfo(p5);
        //Path:/Users
        //Name:Users
        //Parent Directory:/
        //Root Component:/
        //Name Count:1
        //[Users]
    }

    private static void dispPathInfo(Path p){
        System.out.println(STR."Path:\{p}");
        System.out.println(STR."Name:\{p.getFileName()}");
        System.out.println(STR."Parent Directory:\{p.getParent()}");
        System.out.println(STR."Root Component:\{p.getRoot()}");
        System.out.println(STR."Name Count:\{p.getNameCount()}");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < p.getNameCount() ; i++){
            sb.append("[");
            sb.append(p.getName(i));
            sb.append("]");
        }
        System.out.println(sb);
        System.out.println("-----");
    }
}
