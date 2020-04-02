package com.thoughtworks.Answer;

public class Answer {
    private final String path = "../../resources/answer.txt";

    public String getAnswer() {
        String fileAnswer = new FileAnswer(path).createAnswer();
        boolean isWrong = new WrongInput("1234", fileAnswer).isWrong();
        return new File(path).isFile() && !isWrong?
                new FileGetter(path).getAnswer() : new RandomGetter().getAnswer();
    }
}
