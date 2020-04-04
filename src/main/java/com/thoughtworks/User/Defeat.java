package com.thoughtworks.User;

public class Defeat implements OutputInfo {
    private String answer;

    public Defeat(String answer) {
        this.answer = answer;
    }


    @Override
    public String printInfo() {
        return "Unfortunately, you have no chance, the answer is" + answer + "!";
    }
}
