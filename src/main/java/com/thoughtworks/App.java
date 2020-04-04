package com.thoughtworks;

import com.thoughtworks.Answer.Answer;
import com.thoughtworks.User.CompareInput;
import com.thoughtworks.User.Defeat;
import com.thoughtworks.User.GuessTimes;
import com.thoughtworks.User.Success;
import com.thoughtworks.exceptions.WrongInput;
import com.thoughtworks.exceptions.WrongInputException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    String answer = new Answer().getAnswer();
    List<String> guessList = new ArrayList<>();
    String info;
    Scanner scanner = new Scanner(System.in);
    GuessTimes guessTimes = new GuessTimes();
    while(!guessTimes.isMaxChanceTimes()) {
      String input = scanner.nextLine();
      if (new WrongInput(input).isWrongFormat()) {
        System.out.println("您输入的格式错误(必须是纯数字)，请重新输入：");
        continue;
      }
      try {
        if (new WrongInput(input).isWrong()) {
          throw new WrongInputException("Wrong Input");
        } else {
          info = new CompareInput(answer, input).printInfo();
        }
      } catch(WrongInputException e) {
        info = e.getMessage();
        guessList.add(input + " " + info);
        for (String s : guessList) {
          System.out.println(s);
        }
        continue;
      }
      guessList.add(input + " " + info);
      for (String s : guessList) {
        System.out.println(s);
      }
      if (answer.equals(input)) {
        System.out.println(new Success().printInfo());
        break;
      } else if (guessTimes.getTimes() == 5) {
        System.out.println(new Defeat(answer).printInfo());
        break;
      }
      guessTimes.addTimes();
    }
  }
}
