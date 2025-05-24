package com.sample.convertkatakana;

public class ZenkakuHiraganaToZenkakuKatakana {
    /*
     * ぁあぃいぅうぇえぉおかがきぎくぐけげこごさざしじすずせぜそぞ
     * ただちぢっつづてでとどなにぬねのはばぱひびぴふぶぷへべぺほぼぽ
     * まみむめもゃやゅゆょよらりるれろゎわゐゑをん
     *
     * ァアィイゥウェエォオカガキギクグケゲコゴサザシジスズセゼソゾ
     * タダチヂッツヅテデトドナニヌネノハバパヒビピフブプヘベペホボポ
     * マミムメモャヤュユョヨラリルレロヮワヰヱヲンヴヵヶ
     */
    public static String zenkakuHiraganaToZenkakuKatakana(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'ぁ' && c <= 'ん') {
                sb.setCharAt(i, (char)(c - 'ぁ' + 'ァ'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(zenkakuHiraganaToZenkakuKatakana("じゃば・ぷろぐらみんぐ"));
        // ジャバ・プログラミング
    }
}
