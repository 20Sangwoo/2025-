package day2;
/*
  중첩 for문
  문) 별 출력하기 System.out.print("*");
  *
  **
  ***
  ****
  *****
 */
public class Question_6 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i = i + 1) {
      for (int j = 0; j <= i; j = j + 1) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
