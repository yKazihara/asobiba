package com.example;

public class Robot {
    int currentPosition = 0;

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.report(); // Current Position = 0
        robot.moveForward();
        robot.report(); // Current Position = 1
    }

    void report() {
        System.out.println(STR."Current Position = \{currentPosition}");
    }

    void moveForward() {
        currentPosition = currentPosition + 1;
    }
}
