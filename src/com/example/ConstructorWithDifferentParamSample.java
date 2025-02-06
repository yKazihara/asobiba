package com.example;

public class ConstructorWithDifferentParamSample {
    public static void main(String[] args) {
        // コンストラクタ 引数あり
        Television04 tv1 = new Television04("居間");
        tv1.dispChannel();
        //現在のチャンネルは1です
        //設置してある場所は居間です

        System.out.println("-----");

        // コンストラクタ 引数なし
        Television04 tv2 = new Television04();
        tv2.dispChannel();
        //現在のチャンネルは1です
        //設置してある場所は未定です
    }
}

class Television04{
    private int channelNo;
    private String place;

    Television04(){
        channelNo = 1;
        place = "未定";
    }

    Television04(String newPlace){
        channelNo = 1;
        place = newPlace;
    }

    public void setChannel(int newChannelNo) {
        channelNo = newChannelNo;
    }

    public void dispChannel() {
        System.out.println(STR."現在のチャンネルは\{channelNo}です");
        System.out.println(STR."設置してある場所は\{place}です");
    }
}
