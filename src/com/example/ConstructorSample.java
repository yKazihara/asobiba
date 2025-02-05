package com.example;

public class ConstructorSample {
    public static void main(String[] args) {
        Television02 tv2 = new Television02();
        tv2.dispChannel();
        // 現在のチャンネルは国営放送です ← (コンストラクタの設定）
    }
}

class Television02 {
    private int channelNo;
    private String broadcastingStation;

    Television02() {
        channelNo = 1;
        broadcastingStation = "国営放送";
    }

    public void setChannel(int newChannelNo) {
        channelNo = newChannelNo;
        if (channelNo == 1) {
            broadcastingStation = "国営放送";
        } else if (channelNo == 4) {
            broadcastingStation = "民営放送";
        }
    }

    public void dispChannel() {
        System.out.println(STR."現在のチャンネルは\{broadcastingStation}です");
    }
}