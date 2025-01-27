package com.example;

public class Dentaku2 {

    public static void main(String[] args) {
        String val1 = "5";
        String val2 = "8";
        String ope = "kakeru";

        boolean hasValErr = hasValParamsError(val1, val2);
        if (hasValErr) {
            System.out.println("エラー：第一引数か第二引数は、数値を入力してください。");
            System.exit(0);
        }

        boolean hasOpeErr = hasOpeParamError(ope);
        if (hasOpeErr) {
            System.out.println("エラー：第三引数の演算子は、「tasu」「hiku」「kakeru」「waru」 の4つのみ入力可能です。");
            System.exit(0);
        }

        print(val1, val2, ope);
        // 入力された式は 5 kakeru 8 です
    }

    private static boolean hasValParamsError(String val1, String val2) {
        try {
            Integer.parseInt(val1);
            Integer.parseInt(val2);
        } catch(NumberFormatException e) {
            return true;
        }
        return false;
    }

    private static boolean hasOpeParamError(String ope) {
        if (!ope.equals("tasu") && !ope.equals("hiku")
                && !ope.equals("kakeru") && !ope.equals("waru")) {
            return true;
        }
        return false;
    }

    private static void print(String val1, String val2, String ope) {
        System.out.println(STR."入力された式は \{val1} \{ope} \{val2} です");
    }
}
