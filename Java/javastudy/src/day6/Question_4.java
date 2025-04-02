package day6;

import java.util.Scanner;

/*
  배열의 요소 검색
  설명: 정수형 배열에서 특정 요소를 검색하는 메소드를 작성하시오.
  요구사항: 사용자로부터 배열의 크기와 요소를 입력받고, 검색할 값을 입력받아 해당 값의 인덱스를 출력하는 메소드를 구현하시오.

  배열의 크기 : 3
  정수1 : 10
  정수2 : 20
  정수3 : 30
  검색할 값 : 20
  인덱스 : 1

  검색할 값 : 50
  인덱스 : 배열에 존재하지 않습니다.
 */
public class Question_4 {
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

    System.out.print("검색할 값 : ");
    int nubmer = scanner.nextInt();

    int findedIndex = findIndex(array, nubmer);
    if(findedIndex == -1){
      System.out.println("인덱스 : 배열에 존재하지 않습니다.");
    }else{
      System.out.println("인덱스 : " + findedIndex);
    }
  }

  public static int findIndex(int[] array, int number) {
    int index = -1;
    for (int i = 0; i < array.length; i++) {
      if( number == array[i]){
        index = i;
        break;
      }
    }
    return index;
  }
}
