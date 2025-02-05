package com.example;

public class MethodOverloadSample {
    public static void main(String[] args) {
        Television01 tv1 = new Television01();

        tv1.setChannel(1);
        //チャンネルが変更されました
        //チャンネルNoは1
        //放送局は国営放送

        System.out.println("-----");

        tv1.setChannel("国営放送");
        //放送局が変更されました
        //チャンネルNoは1
        //放送局は国営放送

        System.out.println("-----");

        tv1.setChannel(4, "民営放送");
        //チャンネルと放送局が変更されました
        //チャンネルNoは4
        //放送局は民営放送
    }
}

class Television01{
    private int channelNo;
    private String broadcastingStation;

    public void setChannel(int newChannelNo) {
        channelNo = newChannelNo;

        if (newChannelNo == 1) {
            broadcastingStation = "国営放送";
        } else if(newChannelNo == 4) {
            broadcastingStation = "民営放送";
        }

        System.out.println("チャンネルが変更されました");
        dispChannelInfo();
    }

    public void setChannel(String newBroadcastingStation) {
        broadcastingStation = newBroadcastingStation;

        if (newBroadcastingStation.equals("国営放送")) {
            channelNo = 1;
        } else if(newBroadcastingStation.equals("民営放送")) {
            channelNo = 4;
        }

        System.out.println("放送局が変更されました");
        dispChannelInfo();
    }

    public void setChannel(int newChannelNo, String newBroadcastingStation) {
        channelNo = newChannelNo;
        broadcastingStation = newBroadcastingStation;

        System.out.println("チャンネルと放送局が変更されました");
        dispChannelInfo();
    }

    private void dispChannelInfo() {
        System.out.println(STR."チャンネルNoは\{channelNo}");
        System.out.println(STR."放送局は\{broadcastingStation}");
    }
}
