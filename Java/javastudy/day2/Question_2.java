package day2;

import java.util.Scanner;

/*
 문) 사용자로부터 나이를 입력받아 다음과 같은 메시지를 출력하는 프로그램을 작성하세요:
  0세에서 12세: "어린이입니다."
  13세에서 19세: "청소년입니다."
  20세에서 64세: "성인입니다."
  65세 이상: "노인입니다."
 */
public class Question_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("나이를 입력하세요 : ");
    int age = scanner.nextInt();

    if (age >= 0 && age <= 12) {
      System.out.println("어린이입니다.");
    } else if (age >= 13 && age <= 19) {
      System.out.println("청소년입니다.");
    } else if (age >= 20 && age <= 64) {
      System.out.println("성인입니다.");
    } else if (age >= 65) {
      System.out.println("노인입니다.");
    }
  }
}
