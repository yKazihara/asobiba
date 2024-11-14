package com.example;

public class WrapperClassSample {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(16); // valueOfも修正候補でるけど
        int int1 = integer1.intValue(); // intValueも修正候補でるけど
        System.out.println(STR."int1 : \{int1}"); // int1 : 16

        // Integer integer2 = new Integer(16); 廃止済みで非推奨だって

        // オートボクシング まぁ、ふつうはこんな書き方しないほうがいいね。
        Integer integer2 = 26; // intにしろって修正候補は出るね。
        int int2 = integer2.intValue(); // intValueも修正候補でるけど
        System.out.println(STR."int2 : \{int2}"); // int2 : 26
    }
}
