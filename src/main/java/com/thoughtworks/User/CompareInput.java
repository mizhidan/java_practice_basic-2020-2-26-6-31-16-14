package com.thoughtworks.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareInput implements OutputInfo {
    private String answer;
    private String input;

    public CompareInput(String answer, String input) {
        this.answer = answer;
        this.input = input;
    }

    @Override
    public String printInfo() {
        List<String> answerList = new ArrayList<>(Arrays.asList(answer.split("")));
        List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));
        int correctNum = 0;
        int wrongPosition = 0;
        for (int i = 0; i < inputList.size(); i++) {
            if (answerList.contains(inputList.get(i))) {
                if (inputList.get(i).equals(answerList.get(i))) {
                    correctNum++;
                } else {
                    wrongPosition++;
                }
            }
        }
        return correctNum + "A" + wrongPosition + "B";
    }
}
