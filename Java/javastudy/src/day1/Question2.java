package day1;
/*
  점수를 입력받아서 학점을 출력하는 프로그램을 구현하시오
  90 이상은 A, 80 이상은 B, 70 이상은 C. 60 이상은 D, 그 외는 F
 */

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("점수를 입력해주세요. (종료는 0) : ");
      // 정수형 변수에 입력 받은 값 할당
      int score = sc.nextInt();
      // score에 할당된 값이 0이면 종료
      if (score == 0) {
        System.out.println("프로그램 종료");
        break;  // 반복문을 종료하여 프로그램 종료
      }
      // score에 할당된 값의 학점 구분
      if (score >= 90) {
        System.out.println("A");
      } else if (score >= 80) {
        System.out.println("B");
      } else if (score >= 70) {
        System.out.println("C");
      } else if (score >= 60) {
        System.out.println("D");
      } else
        System.out.println("F");
    }
//    사용 끝난 객체 종료
    sc.close();
  }
}
