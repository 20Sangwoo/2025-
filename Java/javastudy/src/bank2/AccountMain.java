package bank2;

import java.util.Scanner;

public class AccountMain {

  static Scanner scanner = new Scanner(System.in);
  static AccountManagement accountManagement = new AccountManagement(3);

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료(x)");
      System.out.print("선택 >> ");
      int menu = scanner.nextInt();
      scanner.nextLine();

      switch (menu) {
        case 1 : // 신규
          accountManagement.addAccount();
          break;
        case 2 : // 폐지
          accountManagement.closeAccount();
          break;
        case 3 : // 입금
          deposit();
          break;
        case 4 : // 출금
          withdraw();
          break;
        case 5 : // 계좌조회(개별)
          getAccount();
          break;
        case 6 : // 계좌조회(전체)
          accountManagement.listAccounts();
          break;
        case 7 : // 종료(x)
          stop = true;
          continue;
        default :
          System.out.println("메뉴선택(1~7) 선택바랍니다.");
      }// end of switch
    } // end of while
  }// end of main

  // 입금
  private static void deposit() {

    while (true) {
      System.out.print("계좌 번호 : ");
      String accountNumber = scanner.nextLine();
      Account findedAccount = accountManagement.findAccount(accountNumber);
      if(findedAccount == null){
        System.out.println("찾고자하는 계좌 번호가 존재하지 않습니다.!");
        continue;
      }
      System.out.print("입금액 : ");
      int money = scanner.nextInt();
      findedAccount.deposit(money);
      break;

    } // end of while
  }// end of method

  // 출금
  private static void withdraw() {
    while (true) {
      System.out.print("계좌 번호 : ");
      String accountNumber = scanner.nextLine();
      Account findedAccount = accountManagement.findAccount(accountNumber);
      if(findedAccount == null){
        System.out.println("찾고자하는 계좌 번호가 존재하지 않습니다.!");
        continue;
      }
      System.out.print("출금액 : ");
      int money = scanner.nextInt();
      findedAccount.withdraw(money);
      break;
    } // end of while
  }

  // 계좌 조회(개별)
  private static void getAccount() {
    System.out.print("계좌 번호 : ");
    String accountNumber = scanner.nextLine();
    Account findedAccount = accountManagement.findAccount(accountNumber);
    if(findedAccount != null){
      System.out.println(findedAccount.getAccountInfo());
    }else{
      System.out.println("찾고자하는 계좌 번호가 존재하지 않습니다.!");
    }
  }
}// end of class