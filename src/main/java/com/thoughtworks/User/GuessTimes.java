package com.thoughtworks.User;

public class GuessTimes {
    private static int times;

    public GuessTimes() {
        this.times = 0;
    }

    public int getTimes() {
        return times;
    }

    public void addTimes() {
        ++times;
    }

    public boolean isMaxChanceTimes() {
        return times == 6;
    }
}
