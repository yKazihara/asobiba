package com.example;

public class ClassSample {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();

        tv1.setPlace("居間");
        tv1.setChannel(1);
        tv1.dispChannel();
        // 居間にあるテレビの現在のチャンネルは 1 です

        tv2.setPlace("寝室");
        tv2.setChannel(8);
        tv2.dispChannel();
        // 寝室にあるテレビの現在のチャンネルは 8 です
    }
}

class Television {
    int channelNo;
    String place;

    void setChannel(int newChannelNo) {
        channelNo = newChannelNo;
    }

    void setPlace(String newPlace) {
        place = newPlace;
    }

    void dispChannel() {
        System.out.println(STR."\{place}にあるテレビの現在のチャンネルは \{channelNo} です");
    }
}
