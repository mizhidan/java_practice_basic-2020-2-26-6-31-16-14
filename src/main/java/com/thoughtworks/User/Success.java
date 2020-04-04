package com.thoughtworks.User;

public class Success implements OutputInfo {

    @Override
    public String printInfo() {
        return "Congratulations, you win!";
    }
}
