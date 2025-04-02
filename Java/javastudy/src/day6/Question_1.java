package day6;

import java.util.Scanner;

/*
  배열의 요소 합계
  설명: 정수형 배열의 요소의 합계를 계산하는 메소드를 작성하시오.
  요구사항: 사용자로부터 배열의 크기와 요소를 입력받아 합계를 출력하는 메소드를 구현하시오.

  ==출력==
  배열의 크기 : 3
  정수1 : 10
  정수2 : 20
  정수3 : 30
  합계 : 60
 */
public class Question_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("배열의 크기 : ");
    int sizeOfArray = scanner.nextInt();
    //배열 생성
    int[] array = new int[sizeOfArray];

    //배열 크기의 정수 입력 받기
    for (int i = 0; i < array.length; i++) {
      System.out.printf("정수%d : ", (i+1) );
      array[i] = scanner.nextInt();
    }

    //배열의 요소 합계 구하기
    int sum = sumOfArray(array);

    //배열의 합계 출력
    System.out.println("합계 = " + sum);
  }

  //배열의 요소합계를 구하는 메소드
  public static int sumOfArray(int[] array){
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

}
