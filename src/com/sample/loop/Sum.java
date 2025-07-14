package com.sample.loop;

public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for( int i =  1  ; i <=  10  ;  i++  ){
            System.out.print(STR."iの値 = \{i}");
            total = total + i ;
            System.out.println(STR."現時点totalの値 = \{total}");
        }
        System.out.println(STR."1～10の合計は \{total} です。");
        //iの値 = 1現時点totalの値 = 1
        //iの値 = 2現時点totalの値 = 3
        //iの値 = 3現時点totalの値 = 6
        //iの値 = 4現時点totalの値 = 10
        //iの値 = 5現時点totalの値 = 15
        //iの値 = 6現時点totalの値 = 21
        //iの値 = 7現時点totalの値 = 28
        //iの値 = 8現時点totalの値 = 36
        //iの値 = 9現時点totalの値 = 45
        //iの値 = 10現時点totalの値 = 55
        //1～10の合計は 55 です。
    }
}
