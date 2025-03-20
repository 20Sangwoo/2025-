package day1;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    // 사용자에게 값을 입력받는 객체 Scanner 사용
    Scanner sc = new Scanner(System.in);

    System.out.println("정수를 입력하면 홀수인지, 짝수인지 판단하는 프로그램입니다.");
    // 프로그램이 종료될 때까지 계속 입력받기
    while (true) {
      System.out.print("정수를 입력하세요. (종료는 0 입력) : ");
      // 정수형 변수에 입력 받은 값 할당
      int val = sc.nextInt();
      // val에 할당된 값이 0이면 종료
      if (val == 0) {
        System.out.println("프로그램 종료");
        break;  // 반복문을 종료하여 프로그램 종료
      }
      // val에 할당된 값이 짝수인지 홀수인지 구분
      if (val % 2 == 0) {
        System.out.println("짝수입니다.");
      } else {
        System.out.println("홀수입니다.");
      }
    }
    // sc 객체 사용이 끝나면 종료
    sc.close();
  }
}