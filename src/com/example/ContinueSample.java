package com.example;

public class ContinueSample {
    public static void main(String[] args) {
        // 数値が3の倍数だった場合は表示をスキップするので、3 6 9は表示されない
        for (int i = 1; i < 10; i++){
            if (i % 3 == 0){
                continue;
            }

            System.out.println(STR."i = \{i}");
        }

        System.out.println("End");

        System.out.println("-----");

        for (int i = 1; i < 5; i++){

            for (int j = 1; j < 5; j++){
                if (i * j % 3 == 0){
                    continue;
                }

                System.out.println(STR."\{i} * \{j} = \{i * j}");
            }

            System.out.println("Next");
        }

        System.out.println("End");
        //　1 * 1 = 1
        //　1 * 2 = 2
        //　1 * 4 = 4
        //　Next
        //　2 * 1 = 2
        //　2 * 2 = 4
        //　2 * 4 = 8
        //　Next
        //　Next
        //　4 * 1 = 4
        //　4 * 2 = 8
        //　4 * 4 = 16
        //　Next
        //　End
    }
}
