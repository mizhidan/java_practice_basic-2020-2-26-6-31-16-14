package com.thoughtworks.Answer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomAnswer implements CreateAnswer {

    @Override
    public String createAnswer() {
        Set<Integer> answerSet = new HashSet<>();
        Random randomNum = new Random();
        StringBuilder answer = new StringBuilder();
        while(answerSet.size() < 4) {
            answerSet.add(randomNum.nextInt(10));
        }
        for(Integer value : answerSet) {
            answer.append(value);
        }
        return answer.toString();
    }
}
