package com.sample.convertnumber;

public class ZenkakuNumberToHankakuNumber {
    public static String zenkakuNumToHankaku(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= '０' && c <= '９') {
                sb.setCharAt(i, (char)(c - '０' + '0'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(zenkakuNumToHankaku("お買い上げ金額は￥１９８０です。"));
        // お買い上げ金額は￥1980です。
    }
}
