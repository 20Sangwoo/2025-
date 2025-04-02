package day7;

import java.util.Scanner;

/*
  ATM기 입출금 구현하기
  제약조건 : 1. 마이너스 통장이 아니다.
            2. 구좌에 최대 10만원까지 입금 가능하다.
            3. 1000원 미만으로 입출금 불가
            4. 출금액이 잔액보다 많으면 출금이 안되도록 구현
            4. 메인 메소드 만을 사용하여 구현

    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 1
    입금액 : 10000
    10000원이 입금되었습니다. 잔액 : 10000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 3
    잔액 : 10000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 2
    출금액 : 5000
    5000원이 출금되었습니다. 잔액 : 5000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 2
    출금액 : 10000
    잔액이 부족합니다   잔액 : 5000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    -----------------------------------
    메뉴 : 0
    프로그램 종료!!
 */
public class Question_2_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int balance = 0;  // 잔액
    boolean stop = false;
    while (!stop) {
      System.out.println("----------------------------------");
      System.out.println("메뉴 : 1.입금  2.출금  3.잔액  0.종료");
      System.out.println("-----------------------------------");
      System.out.printf("선택 : ");
      int menu = scanner.nextInt();
      int money = 0;  // 입출금액
      switch (menu) {
        case 1:  // 입금
          balance = deposit(scanner, balance);
          break;
        case 2:  // 출금
          balance = widthdrawal(scanner, balance);
          break;
        case 3:  // 잔액
          System.out.printf("잔액 : %d \n", balance);
          break;
        case 0:  // 종료
          stop = true;
          continue;
        default:
          System.out.println("메뉴(0~3) 선택 바랍니다.");
      }// end of switch
    } // end of while
  } // end of main

  private static int widthdrawal(Scanner scanner, int balance) {
    int money;
    while (true) {
      System.out.printf("출금액 : ");
      money = scanner.nextInt();
      //1) 1000 미만 출금불가
      if(money < 1000){
        System.out.println("1000원 미만 출금 불가!");
        continue;
      }
      //2) 출금액이 잔액보다 클수 없다.
      if(balance < money){
        System.out.printf("잔액이 모지랍니다. 잔액 : %d \n", balance);
        continue;
      }
      break;
    }
    balance -= money;
    System.out.printf("%d원이 출금 되었습니다. 잔액 : %d \n", money, balance);
    return balance;
  }

  private static int deposit(Scanner scanner, int balance) {
    int money;
    while (true) {
      System.out.printf("입금액 : ");
      money = scanner.nextInt();
      //1) 1000 미만 입금불가
      if(money < 1000){
        System.out.println("1000원 미만 입금 불가!");
        continue;
      }
      //2) 최대 입금액 10만원 초과 불가
      if(balance + money > 100_000){
        System.out.println("최대 입금액 10만원 초과!");
        continue;
      }
      break;
    }
    balance += money;
    System.out.printf("%d원이 입금되었습니다. 잔액 : %d \n", money, balance);
    return balance;
  }
}
