package day4;

import java.util.Random;
import java.util.Scanner;

/*
  문) 컴퓨터와 사용자가 참여하는 가위(1), 바위(2), 보(3) 게임을 구현하시오.
      (단, 게임은 3번 수행해서 승수가 많은 쪽이 이기도록 한다.)
      게임이 종료되면 승부결과를 아래와 같이 출력한다.
      ======
      컴퓨터 : 1승,  사용자 : 2승
      사용자가 우승 하였습니다.
 */
public class Question_2_7 {
  public static void main(String[] args) {
    Random random = new Random();
    int computer = random.nextInt(3) + 1;  // 임의의 정수 발생
//    System.out.println("computer = " + computer);

    Scanner scanner = new Scanner(System.in);
    int computerCnt = 0;
    int userCnt = 0;

    int cnt = 0;
    while( cnt < 3 ) {
      System.out.println(">> 가위 바위 보 게임 <<");
      System.out.println("메뉴 : 가위(1), 바위(2), 보(3), 종료(0)");
      System.out.printf("선택 > ");
      int user = scanner.nextInt();
//    System.out.println("user = " + user);

      if(user < 0 || user > 3){
        System.out.println("0~3 사이의 값을 입력하세요!");
        continue;
      }
      cnt++;

      if( user == 0){
        break; // 가장 가까운 반복문 1개를 빠져나간다.
      }

      // 컴퓨터가 이기는 경우
      // 1. 컴퓨터-가위 , 사용자-보
      // 2. 컴퓨터-바위 , 사용자-가위
      // 3. 컴퓨터-보,    사용자-바위
      if (computer == 1 && user == 3 ||
          computer == 2 && user == 1 ||
          computer == 3 && user == 2) {

        computerCnt++;   // computerCnt = computerCnt + 1, computerCnt += 1
        System.out.printf("컴퓨터 승!, 컴퓨터: %s, 사용자: %s\n", changeString(computer), changeString(user));
      } else if (computer == user) {

        userCnt++;      // userCnt = userCnt + 1; userCnt += 1;
        System.out.printf("컴퓨터 승!, 컴퓨터: %s, 사용자: %s\n", changeString(computer), changeString(user));
      } else {

        System.out.printf("컴퓨터 승!, 컴퓨터: %s, 사용자: %s\n", changeString(computer), changeString(user));
      }
    }

    System.out.println("== 최종 결과 ==");
    System.out.printf("컴퓨터 : %d승,  사용자 : %d승 \n", computerCnt, userCnt);
    if(computerCnt > userCnt){
      System.out.println("컴퓨터가 우승 하였습니다.");
    }else if(computerCnt < userCnt) {
      System.out.println("사용자가 우승 하였습니다.");
    }else {
      System.out.println("비겼습니다.");
    }
  }

  public static String changeString(int num) {
    String str = "";
    switch (num){
      case 1:
        str = "가위";
        break;
      case 2:
        str = "바위";
        break;
      case 3:
        str = "보";
        break;
      default:
        System.out.println("1~3의 범위를 초과하는 정수가 입력값으로 들어왔음! = " + num);
    }
    return str;
  }
}
