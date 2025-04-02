package day6;

import java.util.Scanner;

/*
  배열의 최대값 찾기
  설명: 정수형 배열에서 최대값을 찾는 메소드를 작성하시오.
  요구사항: 사용자로부터 배열의 크기와 요소를 입력받아 최대값을 출력하는 메소드를 구현하시오.
 */
public class Question_2_2 {
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

    //배열 요소중 최대값 구하기
    int max = max_1(array);
    //최대값 출력
    System.out.println("max = " + max);

    //case2) 향상된 for문
    max = max_2(array);
    //최대값 출력
    System.out.println("max = " + max);
    
  }

  public static int max_1(int[] array){
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }
  public static int max_2(int[] array){
    int max = array[0];
    for (int value : array) {
      if (max < value) {
        max = value;
      }
    }
    return max;
  }
}
