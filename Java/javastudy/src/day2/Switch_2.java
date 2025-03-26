package day2;

import java.util.Scanner;

public class Switch_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    int score = scanner.nextInt(); //콘솔로부터 사용자가 입력한 정수를 입력받음

    switch (score / 10) { // 산술연산시 피연산자가 모두 정수면 계산 결과는 정수
      case 9 :
        System.out.println("A학점");
        break;
      case 8 :
        System.out.println("B학점");
        break;
      case 7 :
        System.out.println("C학점");
        break;
      case 6 :
        System.out.println("D학점");
        break;
      default :
        System.out.println("F학점");
    }
  }
}
