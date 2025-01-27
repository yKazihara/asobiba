package com.example;

import java.util.Arrays;
import java.util.List;

public class Dentaku3 {

    // 演算子の定数リスト
    private static final List<String> OPE_LIST
            = Arrays.asList("tasu", "hiku", "kakeru", "waru");

    public static void main(String[] args) {
        // 引数たちの宣言
        String val1 = "5";
        String val2 = "4";
        String ope = "tasu";

        // 引数チェック：：第一引数、第二引数
        boolean hasValErr = hasValParamsError(val1, val2);
        if (hasValErr) {
            System.out.println("エラー：第一引数か第二引数は、数値を入力してください。");
            System.exit(0);
        }

        // 引数チェック：第三引数
        boolean hasOpeErr = hasOpeParamError(ope);
        if (hasOpeErr) {
            System.out.println("エラー：第三引数の演算子は、「tasu」「hiku」「kakeru」「waru」の4つのみ入力可能です。");
            System.exit(0);
        }

        // 引数チェック：：第二引数、第三引数
        boolean hasDivideByZeroErr = hasDivideByZeroErr(val2, ope);
        if (hasDivideByZeroErr) {
            System.out.println("エラー：第三引数の演算子が、「waru」の場合、第二引数にゼロは設定できません（ゼロ割）。");
            System.exit(0);
        }

        // 計算
        int calcResult = calc(val1, val2, ope);

        System.out.println(STR."入力された式は \{val1} \{ope} \{val2} です。");
        // 入力された式は 5 tasu 4 です。

        System.out.println(STR."計算結果は \{calcResult} です。");
        // 計算結果は 9 です
    }

    private static boolean hasValParamsError(String val1, String val2) {
        try {
            Integer.parseInt(val1);
            Integer.parseInt(val2);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private static boolean hasOpeParamError(String ope) {
        if (!OPE_LIST.contains(ope)) {
            return true;
        }
        return false;
    }

    private static boolean hasDivideByZeroErr(String val2, String ope) {
        if (val2 .equals("0") && ope.equals("waru")) {
            return true;
        }
        return false;
    }

    private static int calc(String val1, String val2, String ope) {
       int intVal1 =  Integer.parseInt(val1);
       int intVal2 =Integer.parseInt(val2);

       switch (ope) {
            case "tasu" -> {
                return intVal1 + intVal2;
            }
            case "hiku" -> {
                return intVal1 - intVal2;
            }
            case "kakeru" -> {
                return intVal1 * intVal2;
            }
            case "waru" -> {
                return intVal1 / intVal2;
            }
        }
        return 0; // 基本ここは通らないはず
    }
}
