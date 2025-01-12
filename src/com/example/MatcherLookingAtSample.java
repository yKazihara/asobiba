package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherLookingAtSample {
    public static void main(String[] args) {
        // 対象の文字列の先頭からマッチすれば true
        String regex1 = "港区";
        Pattern p1 = Pattern.compile(regex1);

        Matcher m1 = p1.matcher("港区役所");
        System.out.println(m1.lookingAt()); // true

        Matcher m2 = p1.matcher("東京都港区");
        System.out.println(m2.lookingAt()); // false

        System.out.println("-----");

        String regex2 = "[0-9]{2}";
        Pattern p2 = Pattern.compile(regex2);

        String[] target = {"AAZ02", "75PPT", "ON24KM"};
        for (int i = 0 ; i < 3 ; i++){
            Matcher m = p2.matcher(target[i]);
            if (m.lookingAt()) {
                System.out.println(STR."\{target[i]}は\{m.group()}の部分とマッチしました");
            } else {
                System.out.println(STR."\{target[i]}はマッチしませんでした");
            }
        }
        //AAZ02はマッチしませんでした
        //75PPTは75の部分とマッチしました
        //ON24KMはマッチしませんでした
    }
}
