package day2;
/*
  문) 사용자로 부터 구구단 단수를 입력받아서 입력받은 단수의 구구단을 출력하는 프로그램을 구현하시오
    단수 : 2
    2 * 1 = 2
    2 * 2 = 4
    ..
    2 * 9 = 18
 */

import java.util.Scanner;

public class Question_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("단수를 입력하세요 : ");
    int dansu = scanner.nextInt();

    for ( int i = 1 ; i <= 9 ; i = i + 1){

      System.out.println( dansu + " * " + i + " = " +  dansu * i );

    }
  }
}
