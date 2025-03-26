package day2;

import java.util.Scanner;

/*
  문) 사용자로 부터 2개의 정수값을 입력받아서 큰 값을 출력하는 프로그램을 구현하시오
 */
public class Question_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("첫번째 정수를 입력하세요 : ");
    int value1 = scanner.nextInt();
    System.out.print("두번째 정수를 입력하세요 : ");
    int value2 = scanner.nextInt();

    /* case1) 단순 if문 */
//    if(value1 > value2){
//      System.out.println("큰 수 : " + value1);
//    }
//    if(value1 < value2){
//      System.out.println("큰 수 : " + value2);
//    }
//    if(value1 == value2){
//      System.out.println("같다");
//    }
    /* case2) 다중 if문 */
//    if(value1 > value2){
//      System.out.println("큰 수 : " + value1);
//    }else if(value1 < value2){
//      System.out.println("큰 수 : " + value2);
//    }else{
//      System.out.println("같다");
//    }

    /* case3) 다중 if문 */
//    if(value1 > value2){
//      System.out.println("큰 수 : " + value1);
//    }else if(value1 < value2){
//      System.out.println("큰 수 : " + value2);
//    }else if(value1 == value2){
//      System.out.println("같다");
//    }

    /* case4) switch문 */
    int result = 0; // 변수의 사용범위 : 변수 선언할때의 시작블럭에서 종료블럭까지 유효하다.
    if (value1 - value2 > 0) {
       result = 1;
    }else if(value1 - value2 < 0){
       result = -1;
    }else if(value1 - value2 == 0){
       result = 0;
    }

    switch (result){
      case 1:
        System.out.println("큰 수 : " + value1);
        break;
      case -1:
        System.out.println("큰 수 : " + value2);
        break;
      case 0:
        System.out.println("같다");
        break;
    }
  }
}
