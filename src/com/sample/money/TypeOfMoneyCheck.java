package com.sample.money;

public class TypeOfMoneyCheck {
    public static final int[] YEN_TYPES = {
            10000,5000,1000,500,100,50,10,5,1
    };
    public static int[] getYenCount(int yen, int[] yenType) {
        int[] count = new int[yenType.length];
        for (int i = 0; i < yenType.length; i++) {
            while (yen >= yenType[i]) {
                yen -= yenType[i];
                count[i]++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int yen = 87654;
        int[] count = getYenCount(yen, YEN_TYPES);
        for (int i = 0; i < YEN_TYPES.length; i++) {
            System.out.println(STR."\{YEN_TYPES[i]}円\t\{count[i]}枚");
        }
        //10000円	8枚
        //5000円	1枚
        //1000円	2枚
        //500円	1枚
        //100円	1枚
        //50円	1枚
        //10円	0枚
        //5円	0枚
        //1円	4枚
    }
}
