package day2;

import java.util.Scanner;

/*
  사용자로부터 정수를 입력받아서
  2의 배수이면 "2의 배수 입니다" 출력
  3의 배수이면 "3의 배수 입니다" 출력
  2의 배수이면서 3의 배수인 경우 "2의 배수 이면서 3의 배수 입니다" 출력하는 프로그램을 구현하시오
 */
public class Question_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력하세요 : ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("2의 배수 입니다.");
    }
    if (number % 3 == 0) {
      System.out.println("3의 배수 입니다.");
    }
    if (number % 2 == 0 && number % 3 == 0) {
      System.out.println("2의 배수 이면서 3의 배수 입니다.");
    }
    if (!(number % 2 == 0 && number % 3 == 0)) {
      System.out.println("2의 배수도 3의 배수도 아닙니다.");
    }
    System.out.println(number % 2 == 0 && number % 3 == 0);

    boolean result = number % 2 == 0 && number % 3 == 0;
    System.out.println(result);
  }
}
