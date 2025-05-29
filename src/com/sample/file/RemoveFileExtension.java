package com.sample.file;

import java.io.File;

public class RemoveFileExtension {
    public static String removeFileExtension(String filename) {
        int lastDotPos = filename.lastIndexOf('.');

        if (lastDotPos == -1) {
            return filename;
        } else if (lastDotPos == 0) {
            return filename;
        } else {
            return filename.substring(0, lastDotPos);
        }
    }

    public static void main(String[] args) {

        // 拡張子を含む場合は、拡張子を取り除きます。
        System.out.println(removeFileExtension("test.txt"));
        // test

        // 拡張子を含まない場合は、そのままです。
        System.out.println(removeFileExtension("hosts"));
        // hosts

        // ドットで始まるファイル名の場合は、そのままです。
        System.out.println(removeFileExtension(".bashrc"));
        // .bashrc

        // ファイルオブジェクトから拡張子を除く方法です。
        File file = new File("src/com/sample/file/fileToStringText.txt");
        String filename = file.getName();
        System.out.println(removeFileExtension(filename));
        // fileToStringText
    }
}
