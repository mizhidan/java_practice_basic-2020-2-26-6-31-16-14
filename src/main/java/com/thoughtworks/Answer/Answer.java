package com.thoughtworks.Answer;

import com.thoughtworks.exceptions.WrongInput;

import java.io.File;

public class Answer {
    private final String path = "../../resources/answer.txt";

    public String getAnswer() {
        String fileAnswer = new FileAnswer(path).createAnswer();
        boolean isWrong = new WrongInput( fileAnswer).isWrong();
        return new File(path).isFile() && !isWrong ?
                new FileAnswer(path).createAnswer() : new RandomAnswer().createAnswer();
    }
}
