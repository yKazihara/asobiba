package com.sample.version;

public class VersionCheck {
    public static void main(String[] args) {
        System.out.print("Javaバージョン(java.version):");
        System.out.println(System.getProperty("java.version"));
        // 例：Javaバージョン(java.version):22

        System.out.print("オペレーティングシステム名(os.name):");
        System.out.println(System.getProperty("os.name"));
        // 例：オペレーティングシステム名(os.name):Mac OS X
    }
}
