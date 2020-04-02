package com.thoughtworks.Answer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnswer implements CreateAnswer {

    private final String path;

    public FileAnswer(String path) {
        this.path = path;
    }

    @Override
    public String createAnswer() {
        StringBuilder answer = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                answer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer.toString();
    }
}
