package day11.question.q9;

import java.util.Scanner;

public class BaseBallPlayerDriver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BaseballPlayer[] bp = new BaseballPlayer[9];

    String bpname;
    String bpposition;
    int nohits;
    int nowalks;

//    1. 9 명의 선수들의 이름, 위치, 안타수와 4 구수를 입력받는다.
    System.out.println("팀 명단을 작성하겠습니다.");
    System.out.println("=======================");

    for(int i=0; i<9; i++) {
      System.out.println("이름 : ");
      bpname = sc.nextLine();
      System.out.println("위치 : ");
      bpposition = sc.nextLine();
      System.out.println("안타 수 : ");
      nohits = sc.nextInt();
      System.out.println("4구 수 : ");
      nowalks = sc.nextInt();

      bp[i] = new BaseballPlayer(bpname);
      bp[i].setPosition(bpposition);
      bp[i].setNumHits(nohits);
      bp[i].setNumWalks(nowalks);

      sc.nextLine();
    }

//    2. 9 명의 선수들의 이름, 위치, 안타수와 4 구수를 모범출력에 주어진 포맷에 따라 출력한다.
    System.out.println("팀 명단");
    System.out.println("=======================");

    for (int i=0; i<9; i++) {
      System.out.println((i+1) + ". " + bp[i]);
    }

//    3. 9 명의 선수들의 안타수들의 합과 4 구수들의 합을 구하여 출력한다.
    int sumHits = 0;
    int sumWalks = 0;

    for (int i=0; i<9; i++) {
      sumHits += bp[i].getNumHits();
      sumWalks += bp[i].getNumWalks();
    }

    System.out.println("안타 수 합 : " + sumHits);
    System.out.println("4구 수 합 : " + sumWalks);
    sc.close();
  }
}
