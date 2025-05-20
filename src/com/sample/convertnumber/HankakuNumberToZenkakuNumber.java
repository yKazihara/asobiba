package com.sample.convertnumber;

public class HankakuNumberToZenkakuNumber {
    public static String hankakuNumberToZenkakuNumber(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.setCharAt(i, (char) (c - '0' + '０'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(hankakuNumberToZenkakuNumber("お買い上げ金額は￥1980です。"));
        // お買い上げ金額は￥１９８０です。
    }
}
