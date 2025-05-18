package com.sample.convertalphabet;

public class ZenkakuAlphabetToHankakuAlphabet {
    public static String zenkakuAlphabetToHankaku(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ａ' && c <= 'ｚ') {
                sb.setCharAt(i, (char) (c - 'ａ' + 'a'));
            } else if (c >= 'Ａ' && c <= 'Ｚ') {
                sb.setCharAt(i, (char) (c - 'Ａ' + 'A'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(zenkakuAlphabetToHankaku("☆Ｊａｖａプログラミング☆"));
        // ☆Javaプログラミング☆
    }
}
