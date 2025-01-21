package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample06 {
    public static void main(String[] args) {
        String regex1 = "smart(?=phone)";
        Pattern p1 = Pattern.compile(regex1);

        String[] target1 = {"smart", "smartphone", "smartwatch"};

        for (int i = 0; i < target1.length ; i++) {
            Matcher m = p1.matcher(target1[i]);
            System.out.print(STR."\{target1[i]}は");
            if (m.find()) {
                System.out.println("マッチしました");
                System.out.println(STR."マッチしたのは \{m.group()} です");
            } else {
                System.out.println("マッチしませんでした");
            }
        }
        //smartはマッチしませんでした
        //smartphoneはマッチしました
        //マッチしたのは smart です
        //smartwatchはマッチしませんでした

        System.out.println("-----");

        String regex2 = "smart(?!phone)";
        Pattern p2 = Pattern.compile(regex2);

        String[] target2 = {"smart", "smartphone", "smartwatch"};

        for (int i = 0; i < target2.length ; i++) {
            Matcher m = p2.matcher(target2[i]);
            System.out.print(STR."\{target2[i]}は");
            if (m.find()) {
                System.out.println("マッチしました");
                System.out.println(STR."マッチしたのは \{m.group()} です");
            } else {
                System.out.println("マッチしませんでした");
            }
        }
        //smartはマッチしました
        //マッチしたのは smart です
        //smartphoneはマッチしませんでした
        //smartwatchはマッチしました
        //マッチしたのは smart です

        System.out.println("-----");

        String regex3 = "(?<=digital)camera";
        Pattern p3 = Pattern.compile(regex3);

        String[] target3 = {"camera", "digitalcamera", "analogcamera"};

        for (int i = 0; i < target3.length ; i++) {
            Matcher m = p3.matcher(target3[i]);
            System.out.print(STR."\{target3[i]}は");
            if (m.find()) {
                System.out.println("マッチしました");
                System.out.println(STR."マッチしたのは \{m.group()} です");
            } else {
                System.out.println("マッチしませんでした");
            }
        }
        //cameraはマッチしませんでした
        //digitalcameraはマッチしました
        //マッチしたのは camera です
        //analogcameraはマッチしませんでした

        System.out.println("-----");

        String regex4 = "(?<!digital)camera";
        Pattern p4 = Pattern.compile(regex4);

        String[] target4 = {"camera", "digitalcamera", "analogcamera"};

        for (int i = 0; i < target4.length ; i++){
            Matcher m = p4.matcher(target4[i]);
            System.out.print(STR."\{target4[i]}は");
            if (m.find()) {
                System.out.println("マッチしました");
                System.out.println(STR."マッチしたのは \{m.group()} です");
            } else {
                System.out.println("マッチしませんでした");
            }
        }
        //cameraはマッチしました
        //マッチしたのは camera です
        //digitalcameraはマッチしませんでした
        //analogcameraはマッチしました
        //マッチしたのは camera です
    }
}
