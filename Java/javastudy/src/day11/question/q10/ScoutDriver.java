package day11.question.q10;

import java.util.Scanner;

public class ScoutDriver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scout[] gscout = new Scout[3];

    String gscoutname;
    int saleweeks = 0;
    int saleperweek = 0;

//    1. 세 명의 걸스카우트 단원들의 이름들을 읽어 들여 세 개의 걸스카우트 단원 객체들을 생성한다
    for (int i=0; i<3; i++) {
      System.out.println("단원 이름을 입력해주세요 : ");
      gscoutname = sc.nextLine();

      System.out.println(gscoutname + " 입력 완료");
      gscout[i] = new Scout(gscoutname);
    }
//    2. 과자 판매가 계속되는 주들의 수를 읽어 들인다.
    System.out.println("과자 판매가 계속되는 주의 수 : ");
    saleweeks = sc.nextInt();
//    3. 매 주 각 걸스카우트 단원이 판매한 과자 상자 수들을 입력받는다.
    for (int i=0; i<3; i++) {
      System.out.println("각 단원이 판매한 과자 상자 수를 입력해주세요 : ");
      System.out.println((i+1) + "번 단원 " + gscout[i].getName() + "의 판매 상자 수 : ");
      saleperweek = sc.nextInt();

      gscout[i].updateSales(saleweeks * saleperweek);

      System.out.println(saleperweek + " 입력 완료");
    }
//    4. 각 걸스카우트 단원에 대해 이름과 총 판매 상자 수를 출력한다
    for (int i=0; i<3; i++) {
      System.out.println(gscout[i].toString());
    }
    sc.close();
  }
}
