package com.sample.convertalphabet;

public class HankakuAlphabetToZenkakuAlphabet {
    public static String hankakuAlphabetToZenkakuAlphabet(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.setCharAt(i, (char)(c - 'a' + 'ａ'));
            } else if (c >= 'A' && c <= 'Z') {
                sb.setCharAt(i, (char)(c - 'A' + 'Ａ'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(hankakuAlphabetToZenkakuAlphabet("日本語処理のProgramming"));
        // 日本語処理のＰｒｏｇｒａｍｍｉｎｇ
    }

}
