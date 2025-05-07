package bank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountMain {

  static Scanner scanner = new Scanner(System.in);
  static final int ACCOUNT_MAX_SIZE = 3;  // 계좌 개설 최대 개수
  static Account[] accounts = new Account[ACCOUNT_MAX_SIZE];
  static int cntOfAccount;  // 계좌 개설 개수

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료(x)");
      System.out.print("선택 >> ");
      int menu = scanner.nextInt();
      scanner.nextLine();

      switch (menu) {
        case 1 : // 신규
          addAccount();
          break;
        case 2 : // 폐지
          closingAccount();
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
          listAccount();
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
      Account findedAccount = findAccount(accountNumber);
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

  // 폐지
  private static void closingAccount() {
    while (true) {
      System.out.print("계좌 번호 : ");
      String accountNumber = scanner.nextLine();
      int findedIndex = findIndexOfAccount(accountNumber);
      if( findedIndex == -1 ){
        System.out.println("찾고자하는 계좌 번호가 존재하지 않습니다.!");
        continue;
      }
      // 잔액 확인
      if(accounts[findedIndex].getBalance() > 0){
        System.out.printf("잔액 : %d 가 있습니다.",accounts[findedIndex].getBalance());
        System.out.println();
        return;
      }
      // 폐지 처리
      accounts[findedIndex] = null;
      System.out.printf("계좌번호 : %s 가 폐지 되었습니다.",accountNumber);
      System.out.println();
      cntOfAccount--;  // 개좌 개설수 차감
      break;
    }
  }

  // 출금
  private static void withdraw() {
    while (true) {
      System.out.print("계좌 번호 : ");
      String accountNumber = scanner.nextLine();
      Account findedAccount = findAccount(accountNumber);
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
    Account findedAccount = findAccount(accountNumber);
    if(findedAccount != null){
      System.out.println(findedAccount.getAccountInfo());
    }else{
      System.out.println("찾고자하는 계좌 번호가 존재하지 않습니다.!");
    }
  }

  // 전체조회
  private static void listAccount() {
    System.out.printf("사용중인 계좌수 : %s, 잔여계좌수 : %s \n", cntOfAccount, ACCOUNT_MAX_SIZE-cntOfAccount);
    for (Account account : accounts) {
      if(account != null){
        System.out.println(account.getAccountInfo());
      }
    }
  }

  // 계좌번호로 계좌 찾기
  private static Account findAccount(String accountNumber) {
    Account account = null;
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null) {
        if (accountNumber.equals(accounts[i].getAccountNumber())) {
          account = accounts[i];
          break;
        }
      }
    }
    return account;
  }

  // 계좌번호로 인덱스 찾기
  private static int findIndexOfAccount(String accountNumber) {
    int idx = -1;
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null) {
        if (accountNumber.equals(accounts[i].getAccountNumber())) {
          idx = i;
          break;
        }
      }
    }
    return idx;
  }

  //계좌 생성
  private static void addAccount() {
    //1) 계좌 개설수 확인
    if( ACCOUNT_MAX_SIZE == cntOfAccount){
      System.out.println("계좌 개설수를 초과!");
      return;
    }
    //2) 계좌 개설
    String accountName = null;
    boolean stop = false;
    while (!stop) {
      System.out.print("예금주명 : ");
      accountName = scanner.nextLine();

      //2-1) 동명이인 확인
      if(!existAccountName(accountName)){
        //2-2) 계좌 개설
        for (int i=0; i<accounts.length; i++) {
          if (accounts[i] == null) {
            accounts[i] = new Account(accountName);
            cntOfAccount++; // 계좌 개설 수 증가
            stop = true;
            break;
          }
        }
      }// end of if
    }// end of while
  } // end of method

  // 동명이인 체크
  private static boolean existAccountName(String accountName) {
    boolean exist = false;
    for(Account account : accounts){
      if(account != null) {
        if(accountName.equals(account.getAccountName())){
          exist = true;
          System.out.println("동명이인이 존재합니다.");
          break;
        }
      }
    }
    return exist;
  }

}// end of class