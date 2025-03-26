package day4;

import java.util.Random;
import java.util.Scanner;

/*
 문) 1 ~ 10까지의 임의의 정수값 맞추기 (while문)
    제약 조건 : 3번의 기회가 주어짐. 3번의 기회를 놓치면 꽝!
    컴퓨터 : 2

    번호 : 5
    작다
    번호 : 3
    작다
    번호 : 2
    빙고!
 */
public class Question_3_2 {
  public static void main(String[] args) {
    //1) 컴퓨터가 임의의 정수(1~10)를 갖도록한다.
    Random random = new Random();
    int computer = random.nextInt(10) + 1;
//    System.out.println("compuer = " + compuer);
    //2) 사용자로 부터 정답을 입력받는다.
    Scanner scanner = new Scanner(System.in);
    boolean flag = false;

    int cnt = 0;
    while ( cnt < 3) {
      System.out.print("번호 : ");
      int user = scanner.nextInt();

      //3) 컴퓨터가 갖고있는 정수와 사용자가 입력한 정수 비교
      //3-1) 컴퓨터 정수값 > 사용자 정수값  이면  "크다" 출력
      if (computer > user) {
        System.out.println("크다");

      } else if(computer < user) {
        //3-2) 컴퓨터 정수값 < 사용자 정수값  이면  "작다" 출력
        System.out.println("작다");

      } else if(computer == user) {
        //3-3) 컴퓨터 정수값 = 사용자 정수값  이면  "빙고!" 출력 하고 종료
        flag = true;
        break;
      }
      cnt++;
    }
    if(flag){
      System.out.println("빙고!");
    }else {
      //4) 3번의 기회가 초과되면 "꽝!" 출력
      System.out.println("꽝!");
    }
  }
}
