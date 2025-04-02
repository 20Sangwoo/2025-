package day10.question2.q5;

import java.util.Random;

public class Dice {
  private int faceValue;

  public Dice() {

  }

  int roll() {
    Random ra = new Random();
    faceValue = ra.nextInt(6) + 1;
    return faceValue;
  }

  int getFaceValue() {
    return faceValue;
  }
}
