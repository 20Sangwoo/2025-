package day11.question.q8;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    String flag = "예";

    while (flag.equals("예")) {
      int number1 = rand.nextInt(10) + 1;
      int number2 = rand.nextInt(10) + 1;
      int number3 = rand.nextInt(10) + 1;

      System.out.println("이번 게임의 결과: " + number1 + " " + number2 + " " + number3);

      if (number1 == number2 && number2 == number3) {
        System.out.println("1등에 당첨되었습니다 !!!");
      } else if (number1 == number2 || number2 == number3 || number1 == number3) {
        System.out.println("2등에 당첨되었습니다 !!!");
      } else {
        System.out.println("꽝입니다 !!!");
      }

      System.out.println("다음 게임을 진행하시겠습니까? :");
      flag = sc.nextLine();
    }
    System.out.println("게임 종료");
    sc.close();
  }
}