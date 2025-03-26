package day3;

import java.util.Scanner;

/*
  사용자로부터 3개의 정수값을 입력 받아 최대값을 출력하는 프로그램
 */
public class Question_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("첫 번째 정수 (0 : 종료): ");
      int i = sc.nextInt();
      if (i == 0) {
        System.out.println("프로그램 종료");
        break;
      }
      System.out.println("두 번째 정수 (0 : 종료): ");
      int j = sc.nextInt();
      if (j == 0) {
        System.out.println("프로그램 종료");
        break;
      }
      System.out.println("세 번째 정수 (0 : 종료): ");
      int k = sc.nextInt();
      if (k == 0) {
        System.out.println("프로그램 종료");
        break;
      }

      int max = Math.max(i, (Math.max(j, k)));
      int min = Math.min(i, (Math.min(j, k)));

      System.out.printf("세 정수 중 최대값은 %d 입니다. \n", max);
      System.out.printf("세 정수 중 최소값은 %d 입니다. \n", min);
    }
  }
}
