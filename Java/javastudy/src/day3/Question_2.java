package day3;
/*
  가위바위보 게임을 구현 가위(1) 바위(2) 보(3)
 */

import java.util.Random;
import java.util.Scanner;

public class Question_2 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("가위 바위 보 게임입니다.");
      System.out.println("가위(1) 바위(2) 보(3) 종료(0) : ");

      int user = sc.nextInt();
      int computer = random.nextInt(3) + 1;

      if(user == 0) {
        break;
      }

      if (user < 1 || user > 3) {
        System.out.println("에러 : 잘못된 수입니다.");
        continue;
      }

      System.out.printf("사용자 : %d \n", user);
      System.out.printf("컴퓨터 : %d \n", computer);

      String result = result(user, computer);
      System.out.println("결과 : " + result);
    }
  }

  public static String result(int n, int m) {
    if(n == m) {
      return "무승부";
    }
    if((n == 1 && m == 3) || (n == 2 && m == 1) ||
            (n == 3 && m == 2)) {
      return "승리";
    }
    return "패배";
  }
}
