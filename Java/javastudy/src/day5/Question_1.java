package day5;
/*
  국, 영, 수 점수를 입력받아 총합과 평균을 구하는 프로그램을 구현
  국어 : 90
  영어 : 80
  수학 : 70
  총점 : 240
  평균 : 80.0
 */

import java.util.Scanner;

public class Question_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int kor = 0, eng = 0, math = 0, sum;
    double avg;

    System.out.println("점수를 입력해주세요. (종료 : -1)");

    while(true) {
      System.out.print("국어 : ");
      kor = sc.nextInt();
      if (kor == -1) break;

      System.out.print("영어 : ");
      eng = sc.nextInt();
      if (eng == -1) break;

      System.out.print("수학 : ");
      math = sc.nextInt();
      if (math == -1) break;

      System.out.println("----------------------");

      sum = kor + eng + math;
      System.out.printf("총점 : %d \n", sum);

      avg = (double)sum / 3;
      System.out.printf("평균 : %.1f \n", avg);
      System.out.println("=====================");
    }
  }
}