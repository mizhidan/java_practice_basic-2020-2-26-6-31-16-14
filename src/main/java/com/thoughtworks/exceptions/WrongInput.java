package com.thoughtworks.exceptions;

import java.util.Arrays;
import java.util.HashSet;

public class WrongInput {
    private int length;
    private String input;

    public WrongInput(String input) {
        this.input = input;
        this.length = input.length();
    }

    public boolean isWrong() {
        return isWrongLength() || isWrongFormat() || isRepeat();
    }

    private boolean isWrongLength() {
        return length != 4;
    }

    private boolean isRepeat() {
        return length > new HashSet<>(Arrays.asList(input.split(""))).size();
    }

    public boolean isWrongFormat() {
        char[] strArr = this.input.toCharArray();
        for (char c : strArr) {
            if (c > 57 || c < 48) {
                return true;
            }
        }
        return false;
    }
}