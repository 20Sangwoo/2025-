package day5;
/*
  로또 생성기(1~45) 중 6개 출력 (단, 중복되는 숫자는 없도록)
 */

import java.util.Random;

public class Question_2 {
  public static void main(String[] args) {
    Random random = new Random();
    System.out.println("로또 번호 생성기");

    int[] number = new int[6];
    int count = 0;

    while (count < 6) {
      int j = random.nextInt(45) + 1;

      boolean Dup = false;
      for (int i = 0; i < count; i++) {
        if (number[i] == j) {
          Dup = true;
          break;
        }
      }

      if (!Dup) {
        number[count] = j;
        count++;
      }
    }

    System.out.print("로또 번호: ");
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + "\t");
    }
  }
}