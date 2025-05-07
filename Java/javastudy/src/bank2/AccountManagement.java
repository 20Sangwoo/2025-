package bank2;

import java.util.Scanner;

public class AccountManagement {
  //속성
  private Account[] accounts;
  private final int ACCOUNT_MAX_SIZE; //계좌 개설 최대 개수
  private int cntOfAccount;           //계좌 개설수

  private Scanner scanner = new Scanner(System.in);

  public AccountManagement(int cnt) {
    ACCOUNT_MAX_SIZE = cnt;
    accounts = new Account[ACCOUNT_MAX_SIZE];
  }

  //행위
  // 계좌 추가
  void addAccount(){
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
  }

  // 계좌 폐지
  void closeAccount(){
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

  // 전제 조회
  void listAccounts() {
    System.out.printf("사용중인 계좌수 : %s, 잔여계좌수 : %s \n", cntOfAccount, ACCOUNT_MAX_SIZE-cntOfAccount);
    for (int i = 0; i < accounts.length; i++) {
      if(accounts[i] != null){
        System.out.println(accounts[i].getAccountInfo());
      }
    }
  }

  // 계좌번호로 계좌 찾기
  public Account findAccount(String accountNumber) {
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
  private int findIndexOfAccount(String accountNumber) {
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

  // 동명이인 체크
  private boolean existAccountName(String accountName) {
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

}