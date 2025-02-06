package com.example;

public class ConstructorWithParamSample {
    public static void main(String[] args) {
        Television03 tv1 = new Television03("居間");
        tv1.dispChannel();
        //現在のチャンネルは1です
        //設置してある場所は居間です

        System.out.println("-----");

        Television03 tv2 = new Television03("台所");
        tv2.dispChannel();
        //現在のチャンネルは1です
        //設置してある場所は台所です
    }
}

class Television03{
    private int channelNo;
    private String place;

    Television03(String newPlace){
        channelNo = 1;
        place = newPlace;
    }

    public void setChannel(int newChannelNo){
        channelNo = newChannelNo;
    }

    public void dispChannel(){
        System.out.println(STR."現在のチャンネルは\{channelNo}です");
        System.out.println(STR."設置してある場所は\{place}です");
    }
}
