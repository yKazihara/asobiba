package com.example;

public class MathRandomSample {
    public static void main(String[] args) {
        // 5 から 10 までの範囲の乱数を 10 回取得
        // System.out.println((int)Math.ceil(Math.random() * 5) + 5);
        // ↑ だと途中がよくわからないので分解
        for (int i = 0 ; i < 10; i++){
            double doubleNum = Math.random();
            System.out.println(STR."ランダムメソッドで生成されたdouble値：\{doubleNum}");

            double doubleNumMultiply5 = doubleNum * 5;
            System.out.println(STR."5倍した値：\{doubleNumMultiply5}");

            double doubleNumMultiply5Ceil = Math.ceil(doubleNumMultiply5);
            System.out.println(STR."切り上げた値：\{doubleNumMultiply5Ceil}");

            int intNum = (int)doubleNumMultiply5Ceil;
            System.out.println(STR."int変換された値：\{intNum}");

            int intNumPlus5 = intNum + 5;
            System.out.println(STR."5足した値：\{intNumPlus5}");

            System.out.println("-----");

            //ランダムメソッドで生成されたdouble値：0.05459148372277434
            //5倍した値：0.2729574186138717
            //切り上げた値：1.0
            //int変換された値：1
            //5足した値：6
            //-----
            //ランダムメソッドで生成されたdouble値：0.8582935586321224
            //5倍した値：4.291467793160612
            //切り上げた値：5.0
            //int変換された値：5
            //5足した値：10
            //-----
            //ランダムメソッドで生成されたdouble値：0.8303014936701815
            //5倍した値：4.151507468350907
            //切り上げた値：5.0
            //int変換された値：5
            //5足した値：10
            //-----
            //ランダムメソッドで生成されたdouble値：0.6199176889155509
            //5倍した値：3.0995884445777544
            //切り上げた値：4.0
            //int変換された値：4
            //5足した値：9
            //-----
            //ランダムメソッドで生成されたdouble値：0.30480002926688776
            //5倍した値：1.5240001463344388
            //切り上げた値：2.0
            //int変換された値：2
            //5足した値：7
            //-----
            //ランダムメソッドで生成されたdouble値：0.2999972415031078
            //5倍した値：1.499986207515539
            //切り上げた値：2.0
            //int変換された値：2
            //5足した値：7
            //-----
            //ランダムメソッドで生成されたdouble値：0.8421291864614722
            //5倍した値：4.210645932307361
            //切り上げた値：5.0
            //int変換された値：5
            //5足した値：10
            //-----
            //ランダムメソッドで生成されたdouble値：0.720968181999325
            //5倍した値：3.604840909996625
            //切り上げた値：4.0
            //int変換された値：4
            //5足した値：9
            //-----
            //ランダムメソッドで生成されたdouble値：0.09805083222683753
            //5倍した値：0.4902541611341876
            //切り上げた値：1.0
            //int変換された値：1
            //5足した値：6
            //-----
            //ランダムメソッドで生成されたdouble値：0.14558267429442917
            //5倍した値：0.7279133714721459
            //切り上げた値：1.0
            //int変換された値：1
            //5足した値：6
            //-----
        }
    }
}
