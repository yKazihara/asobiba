package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCommentsSample {
    public static void main(String[] args) {
        // パターンの中にコメントを記述できる
        String target = "AZ-243";
        String regex = "[a-zA-Z]{2}  # 製品名" +
                "-            # ハイフン" +
                "[0-9]{3}     # 製品コード";
        Pattern p = Pattern.compile(regex, Pattern.COMMENTS);

        Matcher m = p.matcher(target);
        System.out.println(STR."\{target}:\{m.find()}");
        // AZ-243:true
    }
}
