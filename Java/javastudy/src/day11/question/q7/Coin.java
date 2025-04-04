package day11.question.q7;

import java.util.Random;

public class Coin {
  final int HEADS = 0;
  final int TAILS = 1;
  private String face;

  public Coin() {
    this.face = "앞면";
  }

  void flip() {
    Random random = new Random();
    int result = random.nextInt(2);

    if(result == HEADS) {
      face = "앞면";
    } else {
      face = "뒷면";
    }
  }

  public int getFace() {
    if (face.equals("앞면")) {
      return 0;
    }
    return 1;
  }

  @Override
  public String toString() {
    return face;
  }
}
